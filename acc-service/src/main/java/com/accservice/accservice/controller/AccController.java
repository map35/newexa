package com.accservice.accservice.controller;

import java.util.Random;

import com.accservice.accservice.consumesoap.SoapClient;
import com.accservice.accservice.model.entity.AccPerusahaan;
import com.accservice.accservice.service.AccService;
import com.accservice.accservice.stub.ACCOUNTIDIACMUDOPENR2TWSType;
import com.accservice.accservice.stub.ObjectFactory;
import com.accservice.accservice.stub.OfsFunction;
import com.accservice.accservice.stub.OpenAccountMudharabah;
import com.accservice.accservice.stub.OpenAccountMudharabahResponse;
import com.accservice.accservice.stub.OpenAccountMudharabahValidate;
import com.accservice.accservice.stub.OpenAccountMudharabahValidateResponse;
import com.accservice.accservice.stub.WebRequestCommon;
import com.accservice.accservice.stub.ACCOUNTIDIACMUDOPENR2TWSType.GESERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc")
public class AccController {
    
    @Autowired SoapClient soapClient;
    @Autowired AccService accService;

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
        
        try {
            accPerusahaan.setStatus("1");
            AccPerusahaan accSaved = accService.save(accPerusahaan);
            System.out.println(accSaved.getAccNo());
        } catch (Exception e) {
                System.out.println("exception" +e);
        }

        return openAccountMudharabahValidateResponse;
    }

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

        try {
            AccPerusahaan accData = accService.findByTaxID(accPerusahaan.getTaxID());
            System.out.println("test " +accData.getTaxID());

            if (accData != null){
                accData.setStatus("3");
                accData.setAccNo(openAccountMudharabahResponse.getACCOUNTType().getId());

                accService.updateNoAcc(accData);
                accService.updateStatus(accData);
            
                System.out.println("No Acc: "+accData.getAccNo());
                System.out.println("Status: "+accData.getStatus());
            }     
        } catch (Exception e) {
                System.out.println("exception" +e);
        }

        return openAccountMudharabahResponse;

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
}

