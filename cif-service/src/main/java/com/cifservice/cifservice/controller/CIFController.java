package com.cifservice.cifservice.controller;

import java.util.Random;

import com.cifservice.cifservice.consumesoap.SoapClient;
import com.cifservice.cifservice.model.entity.CIFPerusahaan;
import com.cifservice.cifservice.service.CIFService;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType;
import com.cifservice.cifservice.stub.ObjectFactory;
import com.cifservice.cifservice.stub.OfsFunction;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaan;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaanResponse;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaanValidate;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaanValidateResponse;
import com.cifservice.cifservice.stub.WebRequestCommon;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GLEGALID;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GNAME1;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME.MBDNAME;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GLEGALID.MLEGALID;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GOFFPHONE;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GPOSTCODE;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GSHORTNAME;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GSTREET;
import com.cifservice.cifservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GTAXID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cif")
public class CIFController {
    
    @Autowired SoapClient soapClient;
    @Autowired CIFService cifService;

    // @PostMapping(value = "/coba")
    // public CIFPerusahaan coba(@RequestBody(required =  true) CIFPerusahaan cifPerusahaan){
    //     try{
    //         CIFPerusahaan cifData = cifService.findByTaxID(cifPerusahaan.getTaxID());
    //         if(cifData != null){
    //             System.out.println(cifData.getTaxID());
    //             return cifData;
    //         }

    //     }catch(Exception e){
    //         return null;
    //     }
    //     return cifPerusahaan;
    // }

    @PostMapping(value = "/validateCIF")
    public PembukaanCustomerPerusahaanValidateResponse validateCIF(@RequestBody(required = true) CIFPerusahaan cifPerusahaan){
        
        ObjectFactory objectFactory = new ObjectFactory();
        PembukaanCustomerPerusahaanValidate pembukaanCustomerPerusahaanValidate = new PembukaanCustomerPerusahaanValidate();
        CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1twsnType = setCUSTOMERIDICORPSHORTR1TWSNType(cifPerusahaan);

        // System.out.println("data user "+ cifPerusahaan.getNama());
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSEXADEV");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX" + randomMessageID());
        
        pembukaanCustomerPerusahaanValidate.setWebRequestCommon(webRequestCommon);
        pembukaanCustomerPerusahaanValidate.setOfsFunction(ofsFunction);
        pembukaanCustomerPerusahaanValidate.setCUSTOMERIDICORPSHORTR1TWSNType(customeridicorpshortr1twsnType);

        PembukaanCustomerPerusahaanValidateResponse pembukaanCustomerPerusahaanValidateResponse = soapClient.getCIFData("http://10.0.144.25:8180/iBSM_TWS/services", objectFactory.createPembukaanCustomerPerusahaanValidate(pembukaanCustomerPerusahaanValidate));
        System.out.println("CEK CEK "+ pembukaanCustomerPerusahaanValidateResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ pembukaanCustomerPerusahaanValidateResponse.getStatus().getMessages());
        System.out.println(customeridicorpshortr1twsnType.getFIRSTREGDATE());
        
        try {
            cifPerusahaan.setStatus("1");
            CIFPerusahaan cifSaved = cifService.save(cifPerusahaan);
            System.out.println(cifSaved.getCifNo());
        } catch (Exception e) {
                System.out.println("exception" +e);
        }

        return pembukaanCustomerPerusahaanValidateResponse;
    }

    @PostMapping(value = "/authorCIF")
    public PembukaanCustomerPerusahaanResponse authorCIF(@RequestBody(required = true) CIFPerusahaan cifPerusahaan){

        ObjectFactory objectFactory = new ObjectFactory();
        PembukaanCustomerPerusahaan pembukaanCustomerPerusahaan = new PembukaanCustomerPerusahaan();
        CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1twsnType = setCUSTOMERIDICORPSHORTR1TWSNType(cifPerusahaan);
            
        // System.out.println("data user "+ cifPerusahaan.getNama());
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSEXADEV");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX" + randomMessageID());
        
        pembukaanCustomerPerusahaan.setWebRequestCommon(webRequestCommon);
        pembukaanCustomerPerusahaan.setOfsFunction(ofsFunction);
        pembukaanCustomerPerusahaan.setCUSTOMERIDICORPSHORTR1TWSNType(customeridicorpshortr1twsnType);

        PembukaanCustomerPerusahaanResponse pembukaanCustomerPerusahaanResponse = soapClient.getCIFAuthor("http://10.0.144.25:8180/iBSM_TWS/services", objectFactory.createPembukaanCustomerPerusahaan(pembukaanCustomerPerusahaan));
        System.out.println("CEK CEK "+ pembukaanCustomerPerusahaanResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ pembukaanCustomerPerusahaanResponse.getStatus().getMessages());

        try {
            CIFPerusahaan cifData = cifService.findByTaxID(cifPerusahaan.getTaxID());
            System.out.println("test " +cifData.getTaxID());

            if (cifData != null){
                cifData.setStatus("3");
                cifData.setCifNo(pembukaanCustomerPerusahaanResponse.getCUSTOMERType().getId());

                cifService.updateNoCIF(cifData);
                cifService.updateStatus(cifData);
            
                System.out.println("No CIF: "+cifData.getCifNo());
                System.out.println("Status: "+cifData.getStatus());
            }     
        } catch (Exception e) {
                System.out.println("exception" +e);
        }

        return pembukaanCustomerPerusahaanResponse;
    }

    public CUSTOMERIDICORPSHORTR1TWSNType setCUSTOMERIDICORPSHORTR1TWSNType(CIFPerusahaan cifPerusahaan){

        CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1twsnType = new CUSTOMERIDICORPSHORTR1TWSNType();

        // String
        customeridicorpshortr1twsnType.setALTCUSTID("");
        customeridicorpshortr1twsnType.setACCOUNTOFFICER("");;
        customeridicorpshortr1twsnType.setBUSINESSTYPE(cifPerusahaan.getBusinessType());
        customeridicorpshortr1twsnType.setCOMPANYBOOK("");
        customeridicorpshortr1twsnType.setCONTACTDATE("");
        customeridicorpshortr1twsnType.setCORPBUSSDESC("");
        customeridicorpshortr1twsnType.setCORPFINREPORT(cifPerusahaan.getCorpFinReport());
        customeridicorpshortr1twsnType.setCUSTOMERSINCE("");
        customeridicorpshortr1twsnType.setDISTRICTCODE(cifPerusahaan.getDistrictCode()); 
        customeridicorpshortr1twsnType.setFIRSTREGDATE(cifPerusahaan.getFirstRegDate());
        customeridicorpshortr1twsnType.setFIRSTREGNO(cifPerusahaan.getFirstRegNo());
        customeridicorpshortr1twsnType.setId("");
        customeridicorpshortr1twsnType.setMNEMONIC("");
        customeridicorpshortr1twsnType.setNATIONALITY(cifPerusahaan.getNationality());
        customeridicorpshortr1twsnType.setOTHBSNSSTYPE("");
        customeridicorpshortr1twsnType.setPROVINCE(cifPerusahaan.getProvince());
        customeridicorpshortr1twsnType.setRESIDENCE(cifPerusahaan.getResidence());
        customeridicorpshortr1twsnType.setRESIDEYN(cifPerusahaan.getResideYN());
        customeridicorpshortr1twsnType.setRISKLEVELID("");
        customeridicorpshortr1twsnType.setRTRW(cifPerusahaan.getRt()+"/"+cifPerusahaan.getRw());
        customeridicorpshortr1twsnType.setSECTOR(cifPerusahaan.getSector());
        customeridicorpshortr1twsnType.setSEGMENT(cifPerusahaan.getSegment());
        customeridicorpshortr1twsnType.setSIDECOSECTOR(cifPerusahaan.getSideCoSector());
        
        // Non-String
        MBDNAME mbdname = new MBDNAME();
        mbdname.setBDNAME(cifPerusahaan.getBdName());
        mbdname.setBDPOSITION(cifPerusahaan.getBdPosition());
        GBDNAME gbdname = new GBDNAME();
        gbdname.getMBDNAME().add(mbdname);
        customeridicorpshortr1twsnType.setGBDNAME(gbdname);

        // MFUNDSOURCE MFUNDSOURCE  = new MFUNDSOURCE();
        // MFUNDSOURCE.setFUNDSOURCE("24");
        // GFUNDSOURCE gfundsource = new GFUNDSOURCE();
        // gfundsource.getMFUNDSOURCE().add(MFUNDSOURCE);
        // gfundsource.getMFUNDSOURCE().add(gfundsource);
        // customeridicorpshortr1twsnType.setGFUNDSOURCE(value);

        MLEGALID mlegalid1 = new MLEGALID();
        mlegalid1.setLEGALID(cifPerusahaan.getLegalID1());
        mlegalid1.setLEGALISSDATE(cifPerusahaan.getLegalIssDate1());
        mlegalid1.setLEGALEXPDATE(cifPerusahaan.getLegalExpDate1());
        MLEGALID mlegalid2 = new MLEGALID();
        mlegalid2.setLEGALID(cifPerusahaan.getLegalID2());
        mlegalid2.setLEGALISSDATE(cifPerusahaan.getLegalIssDate2());
        mlegalid2.setLEGALEXPDATE(cifPerusahaan.getLegalExpDate2());
        MLEGALID mlegalid3 = new MLEGALID();
        mlegalid3.setLEGALID(cifPerusahaan.getLegalID3());
        mlegalid3.setLEGALISSDATE(cifPerusahaan.getLegalIssDate3());
        mlegalid3.setLEGALEXPDATE(cifPerusahaan.getLegalExpDate3());
        MLEGALID mlegalid4 = new MLEGALID();
        mlegalid4.setLEGALID(cifPerusahaan.getLegalID4());
        mlegalid4.setLEGALISSDATE(cifPerusahaan.getLegalIssDate4());
        mlegalid4.setLEGALEXPDATE(cifPerusahaan.getLegalExpDate4());
        GLEGALID glegalid = new GLEGALID();
        glegalid.getMLEGALID().add(mlegalid1);
        glegalid.getMLEGALID().add(mlegalid2);
        glegalid.getMLEGALID().add(mlegalid3);
        glegalid.getMLEGALID().add(mlegalid4);
        customeridicorpshortr1twsnType.setGLEGALID(glegalid);

        // customeridicorpshortr1twsnType.setGLIABGROUP(value);
        // customeridicorpshortr1twsnType.setGLLADDRESS(value);

        GNAME1 gname1 = new GNAME1();
        gname1.getNAME1().add(cifPerusahaan.getName1());
        customeridicorpshortr1twsnType.setGNAME1(gname1);
    
        // customeridicorpshortr1twsnType.setGNAME2(value);

        GOFFPHONE goffphone = new GOFFPHONE();
        goffphone.getOFFPHONE().add(cifPerusahaan.getOffPhone());
        customeridicorpshortr1twsnType.setGOFFPHONE(goffphone);

        GPOSTCODE gpostcode = new GPOSTCODE();
        gpostcode.getPOSTCODE().add(cifPerusahaan.getPostCode());
        customeridicorpshortr1twsnType.setGPOSTCODE(gpostcode);
        
        GSHORTNAME gshortname = new GSHORTNAME();
        gshortname.getSHORTNAME().add(cifPerusahaan.getShortName());
        customeridicorpshortr1twsnType.setGSHORTNAME(gshortname);

        GSTREET gstreet = new GSTREET();
        gstreet.getSTREET1().add(cifPerusahaan.getStreet());
        customeridicorpshortr1twsnType.setGSTREET(gstreet);

        GTAXID gtaxid = new GTAXID();
        gtaxid.getTAXID().add(cifPerusahaan.getTaxID());
        customeridicorpshortr1twsnType.setGTAXID(gtaxid);

        return customeridicorpshortr1twsnType;
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
