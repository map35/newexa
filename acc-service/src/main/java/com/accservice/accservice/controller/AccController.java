package com.accservice.accservice.controller;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import com.accservice.accservice.consumesoap.SoapClient;
import com.accservice.accservice.model.entity.AccPerusahaan;
import com.accservice.accservice.model.entity.CIFPerusahaan;
import com.accservice.accservice.response.ResponseHandler;
import com.accservice.accservice.service.AccService;
import com.accservice.accservice.stub.ACCOUNTIDIACMUDOPENR2TWSType;
import com.accservice.accservice.stub.ObjectFactory;
import com.accservice.accservice.stub.OfsFunction;
import com.accservice.accservice.stub.OpenAccountMudharabah;
import com.accservice.accservice.stub.OpenAccountMudharabahResponse;
import com.accservice.accservice.stub.OpenAccountMudharabahValidate;
import com.accservice.accservice.stub.OpenAccountMudharabahValidateResponse;
import com.accservice.accservice.stub.PembukaanCustomerPerusahaanResponse;
import com.accservice.accservice.stub.WebRequestCommon;
import com.accservice.accservice.stub.ACCOUNTIDIACMUDOPENR2TWSType.GESERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/acc")
public class AccController {
    
    @Autowired SoapClient soapClient;
    @Autowired AccService accService;

    @PostMapping(value = "/validateAccMudharabah")
    public ResponseEntity<Object> validateAccMudharabah(@RequestBody(required = true) AccPerusahaan accPerusahaan){
        validateAccMudharabah(accPerusahaan);
        try{

            String idNumber = randomID();
            accPerusahaan.setId(idNumber);
            while(accService.findById(accPerusahaan) != null){
                idNumber = randomID();
            }
            String date = getDateNow();
            String time = getTimeNow();

            accPerusahaan.setId(idNumber);
            accPerusahaan.setCifNo(accPerusahaan.getCifNo());
            accPerusahaan.setAccNo("");
            accPerusahaan.setUserCreatedDate(date);
            accPerusahaan.setUserCreatedTime(time);
            accPerusahaan.setUserCreatedByName(accPerusahaan.getAccountOfficer());
            accPerusahaan.setStatus("1");

            AccPerusahaan accSaved = accService.save(accPerusahaan);

            if(accSaved != null){
                return ResponseHandler.generateResponse("Mudharabah account created!", HttpStatus.OK, true, accSaved);
            }
            return ResponseHandler.generateResponse("Mudharabah account failed!", HttpStatus.OK, true, false);   
        
        } catch (Exception e) {
            System.out.println("exception" +e);
            return ResponseHandler.generateResponse("Mudharabah account failed!", HttpStatus.OK, true, e.getMessage());
           
        }
    }

    @PostMapping(value = "/validateAcc")
    public OpenAccountMudharabahValidateResponse validateEasyMudharabah(@RequestBody(required = true) AccPerusahaan accPerusahaan){
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountMudharabahValidate openAccountMudharabahValidate = new OpenAccountMudharabahValidate();
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = setACCOUNTIDIACMUDOPENR2TWSType(accPerusahaan);

        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSEXADEV");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX" + randomMessageID());
        
        openAccountMudharabahValidate.setWebRequestCommon(webRequestCommon);
        openAccountMudharabahValidate.setOfsFunction(ofsFunction);
        openAccountMudharabahValidate.setACCOUNTIDIACMUDOPENR2TWSType(accountidiacmudopenr2twsType);

        OpenAccountMudharabahValidateResponse openAccountMudharabahValidateResponse = soapClient.getOpenAccountMudharabah("http://10.0.144.25:8180/iBSM_TWS/services", objectFactory.createOpenAccountMudharabahValidate(openAccountMudharabahValidate));
        System.out.println("CEK CEK "+ openAccountMudharabahValidateResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ openAccountMudharabahValidateResponse.getStatus().getMessages());
        
        String numId = randomID();
        accPerusahaan.setId(numId);
        while(accService.findById(accPerusahaan) != null){
            numId = randomID();
        }

        try {
            accPerusahaan.setStatus("1");
            AccPerusahaan accSaved = accService.save(accPerusahaan);
            System.out.println(accSaved.getAccNo());
        } catch (Exception e) {
                System.out.println("exception" +e);
        }

        return openAccountMudharabahValidateResponse;
    }

    @PostMapping(value = "/authorAccMudharabah")
    public ResponseEntity<Object> authorAccMudharabah(@RequestBody(required = true) AccPerusahaan accPerusahaan){
        
        OpenAccountMudharabahResponse openAccountMudharabahResponse = authorEasyMudharabah(accPerusahaan);

        try{
            String date = getDateNow();
            String time = getTimeNow();

            accPerusahaan.setStatus("3");
            accPerusahaan.setAccNo(openAccountMudharabahResponse.getACCOUNTType().getId());
            // accPerusahaan.setAccNo(randomAccount());
            accPerusahaan.setUserApprovedDate(date);
            accPerusahaan.setUserApprovedTime(time);
            accPerusahaan.setUserApprovedByName(accPerusahaan.getAccountOfficer());
            // accPerusahaan.setCifNo("");

            boolean updateAccountNumber = accService.updateAccNo(accPerusahaan);
            boolean updateAccountStatus = accService.updateAccStatus(accPerusahaan);
            boolean updateAccountApprovedDate = accService.updateAccDate(accPerusahaan);
            boolean updateAccountApprovedTime = accService.updateAccTime(accPerusahaan);
            boolean updateUserApprovedByName = accService.updateUserApprovedByName(accPerusahaan);

            if(updateAccountNumber 
            && updateAccountStatus  
            && updateAccountApprovedDate 
            && updateAccountApprovedTime
            && updateUserApprovedByName){
                return ResponseHandler.generateResponse("Authorization Account Success!", HttpStatus.OK, true, true);
            }
            // Keluar sini harusnya ajg
           
            return ResponseHandler.generateResponse("Authorization Account Failed!", HttpStatus.OK, true, true);
        
        } catch (Exception e) {
            System.out.println("exception" +e);
            return null;
        }
    }

    // @PostMapping(value = "/authorAccMudharabahRejected")
    // public ResponseEntity<Object> authorAccMudharabahRejected(@RequestBody(required = true) AccPerusahaan accPerusahaan){

    // }

    @PostMapping(value = "/authorAcc")
    public OpenAccountMudharabahResponse authorEasyMudharabah(@RequestBody(required = true) AccPerusahaan accPerusahaan){
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountMudharabah openAccountMudharabah = new OpenAccountMudharabah();
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = setACCOUNTIDIACMUDOPENR2TWSType(accPerusahaan);

        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSEXADEV");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX" + randomMessageID());
        
        openAccountMudharabah.setWebRequestCommon(webRequestCommon);
        openAccountMudharabah.setOfsFunction(ofsFunction);
        openAccountMudharabah.setACCOUNTIDIACMUDOPENR2TWSType(accountidiacmudopenr2twsType);
        
        OpenAccountMudharabahResponse openAccountMudharabahResponse = soapClient.getOpenAccountMudharabahAuthorization("http://10.0.144.25:8180/iBSM_TWS/services", objectFactory.createOpenAccountMudharabah(openAccountMudharabah));
        System.out.println("CEK CEK "+ openAccountMudharabahResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ openAccountMudharabahResponse.getStatus().getMessages());

        AccPerusahaan accData = accService.findById(accPerusahaan);

        try {
            // AccPerusahaan accData = accService.findById(accPerusahaan);
            // System.out.println("test " +accData.getTaxID());

            if (accData != null){
                accData.setStatus("3");
                accData.setAccNo(openAccountMudharabahResponse.getACCOUNTType().getId());

                accService.updateAccNo(accData);
                accService.updateAccStatus(accData);
            
                System.out.println("No Acc: "+accData.getAccNo());
                System.out.println("Status: "+accData.getStatus());
            }     
        } catch (Exception e) {
                System.out.println("exception" +e);
        }

        return openAccountMudharabahResponse;

    }

    @PostMapping(value = "/authormudharabahaccountwithcif")
    public boolean authorMudharabahAccountNewCIF(@RequestBody(required = true) AccPerusahaan AccPerusahaan){
        
            // System.out.print("cekk pegawai "+AccPerusahaan.getUsername());
            // System.out.println("CEKKKKK ACCOUNT-TWS SERVICE HIT");
            // OpenAccountMudharabahResponse openAccountMudharabahResponse =  accountService.authorMudharabahAccounttoTWS(AccPerusahaan);
            // System.out.println("CEKKKKK AFTER ACCOUNT-TWS SERVICE HIT");

            // if(!openAccountMudharabahResponse.getStatus().getSuccessIndicator().toString().equals("SUCCESS")){
            //     return false;
            // }
            // System.out.println(AccPerusahaan.getCurrency());
            // Employee employeeData = accountService.findByUsername(AccPerusahaan.getUsername());
            // if(employeeData==null){
            //     return false;
            // }
            // if(!employeeData.getRole().equals("CSS") && !employeeData.getRole().equals("BOSM") && !employeeData.getRole().equals("BM")  ){
            //     // boolean is_success = false;
            //     return false;
            // }
            System.out.println(AccPerusahaan.getId());
            AccPerusahaan AccPerusahaan2 = accService.findById(AccPerusahaan);
            
            if(AccPerusahaan2 == null){
                return false;
            }
            String date = getDateNow();
            String time = getTimeNow();
            AccPerusahaan2.setStatus("3");
            // AccPerusahaan2.setAccountNo(openAccountMudharabahResponse.getACCOUNTType().getId());
            AccPerusahaan2.setAccNo(randomAccount());
            AccPerusahaan2.setCifNo(AccPerusahaan.getCifNo());
            AccPerusahaan2.setUserApprovedDate(date);
            AccPerusahaan2.setUserApprovedTime(time);
            // AccPerusahaan2.setUserApprovedByName(employeeData.getName());
            boolean updateCifNumber = accService.updateCIFNumber(AccPerusahaan2);
            boolean updateAccountNumber = accService.updateAccountNo(AccPerusahaan2);
            boolean updateAccountStatus = accService.updateAccountStatus(AccPerusahaan2);
            boolean updateAccountDate = accService.updateAccountDate(AccPerusahaan2);
            boolean updateAccountTime = accService.updateAccountTime(AccPerusahaan2);
            boolean updateUserApprovedByName = accService.updateUserApprovedByName(AccPerusahaan2);

            if(updateCifNumber 
            && updateAccountNumber 
            && updateAccountStatus 
            && updateAccountDate
            && updateAccountTime
            && updateUserApprovedByName ){
                return true;
            }
           
            return false;
        
    }

    @GetMapping(value = "/getallaccount")
    public ResponseEntity<Object> getallaccount(
        @RequestParam(required = false) String acOpenPurpose,
		@RequestParam(required = false) String productCode,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) String cifNo,
        @RequestParam(required = false) String dateofStart,
        @RequestParam(required = false) String dateofFinish){

        try {
            if(acOpenPurpose == null){
                acOpenPurpose = null;
                System.out.println("pupose null");
            }
            if(productCode == null){
                productCode = null;
                System.out.println("product code null");
            }
            if(status == null){
                status = null;
                System.out.println("status null");
            }
            if(cifNo == null){
                cifNo = null;
                System.out.println("cif null");
            }
            if(dateofStart == null){
                dateofStart = null;
                System.out.println("1 null");
            }
            if(dateofFinish == null){
                dateofFinish = null;
                System.out.println("2 null");
            }

            List<AccPerusahaan> accList = accService.getallaccount(
                acOpenPurpose,
                productCode,
                status,
                cifNo,
                dateofStart,
                dateofFinish
            );
            
            
            if(accList!=null){
                return ResponseHandler.generateResponse("Get all account success!", HttpStatus.OK, true, accList);
            }
            
            return ResponseHandler.generateResponse("Get all Account Failed!", HttpStatus.OK, true, false);
        } catch (Exception e) {
            System.out.println("exception" +e);
            return ResponseHandler.generateResponse("Get all Account Failed!", HttpStatus.OK, true, false);
        }
    }

    public ACCOUNTIDIACMUDOPENR2TWSType setACCOUNTIDIACMUDOPENR2TWSType(AccPerusahaan accPerusahaan){
        
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = new ACCOUNTIDIACMUDOPENR2TWSType();
        
        // String
        accountidiacmudopenr2twsType.setACCTRECVBONUS("");
        accountidiacmudopenr2twsType.setACOPENPURPOSE(accPerusahaan.getAcOpenPurpose());
        accountidiacmudopenr2twsType.setAMNESTYFLAG("");
        accountidiacmudopenr2twsType.setAccountOfficer(accPerusahaan.getAccountOfficer());
        accountidiacmudopenr2twsType.setAlternateNumber("");
        accountidiacmudopenr2twsType.setCurrency(accPerusahaan.getCurrency());
        accountidiacmudopenr2twsType.setDESCPRODEXT("");
        accountidiacmudopenr2twsType.setEVENTCODE("");
        accountidiacmudopenr2twsType.setId("");
        accountidiacmudopenr2twsType.setMUDNISBAH("");
        accountidiacmudopenr2twsType.setMUDNISBAHBANK("");
        accountidiacmudopenr2twsType.setMUDNISBAHRTE("");
        accountidiacmudopenr2twsType.setMUDSPCNISBAH("");
        accountidiacmudopenr2twsType.setMUDSPCRATE("");
        accountidiacmudopenr2twsType.setNOREFERAL("");
        accountidiacmudopenr2twsType.setNROPTION("");
        accountidiacmudopenr2twsType.setNoCIF(accPerusahaan.getCifNo());
        accountidiacmudopenr2twsType.setOTHACCPURPOSE("");
        accountidiacmudopenr2twsType.setPOSTINGRESTRICT("");
        accountidiacmudopenr2twsType.setPassbook(accPerusahaan.getPassbook());
        accountidiacmudopenr2twsType.setPrintedName(accPerusahaan.getName1());
        accountidiacmudopenr2twsType.setProductCode(accPerusahaan.getProductCode());
        accountidiacmudopenr2twsType.setQQNAME("");
        accountidiacmudopenr2twsType.setREFOUTSOURCE("");
        accountidiacmudopenr2twsType.setREFPROGRAM("");
        accountidiacmudopenr2twsType.setTAXABLE("");
        accountidiacmudopenr2twsType.setZAKAT(accPerusahaan.getZakat());

        // // Non-String
        GESERVICES geservice = new GESERVICES();
        geservice.getESERVICES().add("");
        accountidiacmudopenr2twsType.setGESERVICES(geservice);

        // accountidiacmudopenr2twsType.setGJOINTHOLDER("");
        // accountidiacmudopenr2twsType.setGKETPAJAK("");

        return accountidiacmudopenr2twsType;
    } 

    public String randomMessageID(){
        Random random = new Random();
        int number = random.nextInt(999999999);
        String id = "1";
        String.format("%09d", number);
        String idNumber = id + number;
        return idNumber;
    }

    public String randomID(){
        Random random = new Random();
        int num = random.nextInt(9999999);
        String numStr = String.format("%05d", num);
        return numStr;
    }

    public String randomAccount(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999999);
        String id = "7";
        String.format("%09d", number);
        String idNumber =  id + number;
        return idNumber;
    }

    public String getDateNow(){
        Instant nowUtc = Instant.now();
        ZoneId asiaJakarta = ZoneId.of("Asia/Jakarta");
        ZonedDateTime nowAsiaJakarta = ZonedDateTime.ofInstant(nowUtc, asiaJakarta);
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedZdt = nowAsiaJakarta.format(formatter);
        return formattedZdt;
    }

    public String getTimeNow(){
        Instant nowUtc = Instant.now();
        ZoneId asiaJakarta = ZoneId.of("Asia/Jakarta");
        ZonedDateTime nowAsiaJakarta = ZonedDateTime.ofInstant(nowUtc, asiaJakarta);
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedZdt = nowAsiaJakarta.format(formatter);
        return formattedZdt;
    }
}

