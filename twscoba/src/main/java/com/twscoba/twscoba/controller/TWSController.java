package com.twscoba.twscoba.controller;

import java.util.Random;

import com.twscoba.twscoba.consumesoap.SoapClient;
import com.twscoba.twscoba.model.AccPerusahaan;
import com.twscoba.twscoba.model.CIFPerusahaan;
import com.twscoba.twscoba.newstub.ACCOUNTIDIACMUDOPENR2TWSType;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType;
import com.twscoba.twscoba.newstub.ObjectFactory;
import com.twscoba.twscoba.newstub.OfsFunction;
import com.twscoba.twscoba.newstub.OpenAccountMudharabah;
import com.twscoba.twscoba.newstub.OpenAccountMudharabahResponse;
import com.twscoba.twscoba.newstub.OpenAccountMudharabahValidate;
import com.twscoba.twscoba.newstub.OpenAccountMudharabahValidateResponse;
import com.twscoba.twscoba.newstub.PembukaanCustomerPerusahaan;
import com.twscoba.twscoba.newstub.PembukaanCustomerPerusahaanResponse;
import com.twscoba.twscoba.newstub.PembukaanCustomerPerusahaanValidate;
import com.twscoba.twscoba.newstub.PembukaanCustomerPerusahaanValidateResponse;
import com.twscoba.twscoba.newstub.WebRequestCommon;
import com.twscoba.twscoba.newstub.ACCOUNTIDIACMUDOPENR2TWSType.GESERVICES;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GLEGALID;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GNAME1;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GOFFPHONE;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GPOSTCODE;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GSHORTNAME;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GSTREET;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GTAXID;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME.MBDNAME;
import com.twscoba.twscoba.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GLEGALID.MLEGALID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tws")
public class TWSController {
    
    @Autowired
    SoapClient soapClient;

    @PostMapping(value = "/validateCIF")
    public PembukaanCustomerPerusahaanValidateResponse validateCIF(@RequestBody(required = true) CIFPerusahaan cifPerusahaan){
        
        ObjectFactory objectFactory = new ObjectFactory();
        PembukaanCustomerPerusahaanValidate pembukaanCustomerPerusahaanValidate = new PembukaanCustomerPerusahaanValidate();
        CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1twsnType = setCUSTOMERIDICORPSHORTR1TWSNType(cifPerusahaan);

        System.out.println("data user "+ cifPerusahaan.getNama());
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSEXADEV");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_a235f6310c3226cIceff917096649123");
        
        pembukaanCustomerPerusahaanValidate.setWebRequestCommon(webRequestCommon);
        pembukaanCustomerPerusahaanValidate.setOfsFunction(ofsFunction);
        pembukaanCustomerPerusahaanValidate.setCUSTOMERIDICORPSHORTR1TWSNType(customeridicorpshortr1twsnType);

        PembukaanCustomerPerusahaanValidateResponse pembukaanCustomerPerusahaanValidateResponse = soapClient.getCIFData("http://10.0.144.25:8180/iBSM_TWS/services", objectFactory.createPembukaanCustomerPerusahaanValidate(pembukaanCustomerPerusahaanValidate));
        System.out.println("CEK CEK "+ pembukaanCustomerPerusahaanValidateResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ pembukaanCustomerPerusahaanValidateResponse.getStatus().getMessages());
        
        return pembukaanCustomerPerusahaanValidateResponse;
    }

    @PostMapping(value = "/authorCIF")
    public PembukaanCustomerPerusahaanResponse authorCIF(@RequestBody(required = true) CIFPerusahaan cifPerusahaan){

        ObjectFactory objectFactory = new ObjectFactory();
        PembukaanCustomerPerusahaan pembukaanCustomerPerusahaan = new PembukaanCustomerPerusahaan();
        CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1twsnType = setCUSTOMERIDICORPSHORTR1TWSNType(cifPerusahaan);
            
        System.out.println("data user "+ cifPerusahaan.getNama());
        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSEXADEV");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_a235f6369c3226cIceff917096649123");
        
        pembukaanCustomerPerusahaan.setWebRequestCommon(webRequestCommon);
        pembukaanCustomerPerusahaan.setOfsFunction(ofsFunction);
        pembukaanCustomerPerusahaan.setCUSTOMERIDICORPSHORTR1TWSNType(customeridicorpshortr1twsnType);

        PembukaanCustomerPerusahaanResponse pembukaanCustomerPerusahaanResponse = soapClient.getCIFAuthor("http://10.0.144.25:8180/iBSM_TWS/services", objectFactory.createPembukaanCustomerPerusahaan(pembukaanCustomerPerusahaan));
        System.out.println("CEK CEK "+ pembukaanCustomerPerusahaanResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ pembukaanCustomerPerusahaanResponse.getStatus().getMessages());
        
        return pembukaanCustomerPerusahaanResponse;
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

        return openAccountMudharabahResponse;

    }

    public CUSTOMERIDICORPSHORTR1TWSNType setCUSTOMERIDICORPSHORTR1TWSNType(CIFPerusahaan cifPerusahaan){

        CUSTOMERIDICORPSHORTR1TWSNType customeridicorpshortr1twsnType = new CUSTOMERIDICORPSHORTR1TWSNType();

        // String
        customeridicorpshortr1twsnType.setALTCUSTID("");
        customeridicorpshortr1twsnType.setACCOUNTOFFICER("");;
        customeridicorpshortr1twsnType.setBUSINESSTYPE("201");
        customeridicorpshortr1twsnType.setCOMPANYBOOK("");
        customeridicorpshortr1twsnType.setCONTACTDATE("");
        customeridicorpshortr1twsnType.setCORPBUSSDESC("");
        customeridicorpshortr1twsnType.setCORPFINREPORT("Y");
        customeridicorpshortr1twsnType.setCUSTOMERSINCE("");
        customeridicorpshortr1twsnType.setDISTRICTCODE("3591"); 
        customeridicorpshortr1twsnType.setFIRSTREGDATE("20160101");
        customeridicorpshortr1twsnType.setFIRSTREGNO("298/bh/kdk19/xi/200");
        customeridicorpshortr1twsnType.setId("");
        customeridicorpshortr1twsnType.setMNEMONIC("");
        customeridicorpshortr1twsnType.setNATIONALITY("ID");
        customeridicorpshortr1twsnType.setOTHBSNSSTYPE("");
        customeridicorpshortr1twsnType.setPROVINCE("3500");
        customeridicorpshortr1twsnType.setRESIDENCE("ID");
        customeridicorpshortr1twsnType.setRESIDEYN("Y");
        customeridicorpshortr1twsnType.setRISKLEVELID("");
        customeridicorpshortr1twsnType.setRTRW("01/01");
        customeridicorpshortr1twsnType.setSECTOR("25");
        customeridicorpshortr1twsnType.setSEGMENT("20");
        customeridicorpshortr1twsnType.setSIDECOSECTOR("9310");
        
        // Non-String
        MBDNAME mbdname = new MBDNAME();
        mbdname.setBDNAME("Amni Tato");
        mbdname.setBDPOSITION("0");
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
        mlegalid1.setLEGALID("298/bh/kdk19/xi/200");
        mlegalid1.setLEGALISSDATE("20000101");
        mlegalid1.setLEGALEXPDATE("20220101");
        MLEGALID mlegalid2 = new MLEGALID();
        mlegalid2.setLEGALID("61 01 01 PM III 2011");
        mlegalid2.setLEGALISSDATE("20000101");
        mlegalid2.setLEGALEXPDATE("20220101");
        MLEGALID mlegalid3 = new MLEGALID();
        mlegalid3.setLEGALID("503/1608/KPPTSP/2011");
        mlegalid3.setLEGALISSDATE("20000101");
        mlegalid3.setLEGALEXPDATE("20220101");
        MLEGALID mlegalid4 = new MLEGALID();
        mlegalid4.setLEGALID("04/KPTS/III/2011");
        mlegalid4.setLEGALISSDATE("20000101");
        mlegalid4.setLEGALEXPDATE("20220101");
        GLEGALID glegalid = new GLEGALID();
        glegalid.getMLEGALID().add(mlegalid1);
        glegalid.getMLEGALID().add(mlegalid2);
        glegalid.getMLEGALID().add(mlegalid3);
        glegalid.getMLEGALID().add(mlegalid4);
        customeridicorpshortr1twsnType.setGLEGALID(glegalid);

        // customeridicorpshortr1twsnType.setGLIABGROUP(value);
        // customeridicorpshortr1twsnType.setGLLADDRESS(value);

        GNAME1 gname1 = new GNAME1();
        gname1.getNAME1().add("Amni Tato");
        customeridicorpshortr1twsnType.setGNAME1(gname1);
    
        // customeridicorpshortr1twsnType.setGNAME2(value);

        GOFFPHONE goffphone = new GOFFPHONE();
        goffphone.getOFFPHONE().add("081019867343");
        customeridicorpshortr1twsnType.setGOFFPHONE(goffphone);

        GPOSTCODE gpostcode = new GPOSTCODE();
        gpostcode.getPOSTCODE().add("228296");
        customeridicorpshortr1twsnType.setGPOSTCODE(gpostcode);
        
        GSHORTNAME gshortname = new GSHORTNAME();
        gshortname.getSHORTNAME().add("PT AT Sejahtera");
        customeridicorpshortr1twsnType.setGSHORTNAME(gshortname);

        GSTREET gstreet = new GSTREET();
        gstreet.getSTREET1().add("Jalan Suci 1 No 6");
        customeridicorpshortr1twsnType.setGSTREET(gstreet);

        GTAXID gtaxid = new GTAXID();
        gtaxid.getTAXID().add("985763019834785");
        customeridicorpshortr1twsnType.setGTAXID(gtaxid);

        return customeridicorpshortr1twsnType;
    }

    public ACCOUNTIDIACMUDOPENR2TWSType setACCOUNTIDIACMUDOPENR2TWSType(AccPerusahaan accPerusahaan){
        
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = new ACCOUNTIDIACMUDOPENR2TWSType();
        
        // String
        accountidiacmudopenr2twsType.setACCTRECVBONUS("");
        accountidiacmudopenr2twsType.setACOPENPURPOSE("21");
        accountidiacmudopenr2twsType.setAMNESTYFLAG("");
        accountidiacmudopenr2twsType.setAccountOfficer("37");
        accountidiacmudopenr2twsType.setAlternateNumber("");
        accountidiacmudopenr2twsType.setCurrency("IDR");
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
        accountidiacmudopenr2twsType.setNoCIF("80141535");
        accountidiacmudopenr2twsType.setOTHACCPURPOSE("");
        accountidiacmudopenr2twsType.setPOSTINGRESTRICT("");
        accountidiacmudopenr2twsType.setPassbook("Y");
        accountidiacmudopenr2twsType.setPrintedName("PT AMNI TATO");
        accountidiacmudopenr2twsType.setProductCode("6020");
        accountidiacmudopenr2twsType.setQQNAME("");
        accountidiacmudopenr2twsType.setREFOUTSOURCE("");
        accountidiacmudopenr2twsType.setREFPROGRAM("");
        accountidiacmudopenr2twsType.setTAXABLE("");
        accountidiacmudopenr2twsType.setZAKAT("N");

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

