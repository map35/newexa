package com.twsservice.twsservice.controller;

import com.twsservice.twsservice.consumesoap.SoapClient;
import com.twsservice.twsservice.model.CIFPerusahaan;
// import com.twsservice.twsservice.stub.ACCOUNTIDIACMUDOPENR2TWSType;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType;
// import com.twsservice.twsservice.stub.ObjectFactory;
// import com.twsservice.twsservice.stub.OfsFunction;
// import com.twsservice.twsservice.stub.OpenAccountMudharabah;
// import com.twsservice.twsservice.stub.OpenAccountMudharabahResponse;
// import com.twsservice.twsservice.stub.OpenAccountMudharabahValidate;
// import com.twsservice.twsservice.stub.OpenAccountMudharabahValidateResponse;
// import com.twsservice.twsservice.stub.PembukaanCustomerPerusahaan;
// import com.twsservice.twsservice.stub.PembukaanCustomerPerusahaanResponse;
// import com.twsservice.twsservice.stub.PembukaanCustomerPerusahaanValidate;
// import com.twsservice.twsservice.stub.PembukaanCustomerPerusahaanValidateResponse;
// import com.twsservice.twsservice.stub.WebRequestCommon;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GFUNDSOURCE;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GNAME1;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GOFFPHONE;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GPOSTCODE;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GSHORTNAME;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GSTREET;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GTAXID;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME.MBDNAME;
// import com.twsservice.twsservice.stub.CUSTOMERIDICORPSHORTR1TWSNType.GFUNDSOURCE.MFUNDSOURCE;
// import com.twsservice.twsservice.stub.CUSTOMERIDIRETAILCHILDMAINTTWSType.GFUNDPROVNAME.MFUNDPROVNAME;
// import com.twsservice.twsservice.stub.CUSTOMERIDIRETAILCHILDR2TWS2Type.GFUNDPROVNAME;

import com.twsservice.twsservice.newstub.ACCOUNTIDIACMUDOPENR2TWSType;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType;
import com.twsservice.twsservice.newstub.ObjectFactory;
import com.twsservice.twsservice.newstub.OfsFunction;
import com.twsservice.twsservice.newstub.OpenAccountMudharabah;
import com.twsservice.twsservice.newstub.OpenAccountMudharabahResponse;
import com.twsservice.twsservice.newstub.OpenAccountMudharabahValidate;
import com.twsservice.twsservice.newstub.OpenAccountMudharabahValidateResponse;
import com.twsservice.twsservice.newstub.PembukaanCustomerPerusahaan;
import com.twsservice.twsservice.newstub.PembukaanCustomerPerusahaanResponse;
import com.twsservice.twsservice.newstub.PembukaanCustomerPerusahaanValidate;
import com.twsservice.twsservice.newstub.PembukaanCustomerPerusahaanValidateResponse;
import com.twsservice.twsservice.newstub.WebRequestCommon;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GFUNDSOURCE;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GNAME1;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GOFFPHONE;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GPOSTCODE;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GSHORTNAME;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GSTREET;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GTAXID;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GBDNAME.MBDNAME;
import com.twsservice.twsservice.newstub.CUSTOMERIDICORPSHORTR1TWSNType.GFUNDSOURCE.MFUNDSOURCE;
import com.twsservice.twsservice.newstub.CUSTOMERIDIRETAILCHILDMAINTTWSType.GFUNDPROVNAME.MFUNDPROVNAME;
import com.twsservice.twsservice.newstub.CUSTOMERIDIRETAILCHILDR2TWS2Type.GFUNDPROVNAME;


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
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_a235f6344c3226ceceff917096649123");
        
        pembukaanCustomerPerusahaanValidate.setWebRequestCommon(webRequestCommon);
        pembukaanCustomerPerusahaanValidate.setOfsFunction(ofsFunction);
        pembukaanCustomerPerusahaanValidate.setCUSTOMERIDICORPSHORTR1TWSNType(customeridicorpshortr1twsnType);

        PembukaanCustomerPerusahaanValidateResponse pembukaanCustomerPerusahaanValidateResponse = soapClient.getCIFData("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createPembukaanCustomerPerusahaanValidate(pembukaanCustomerPerusahaanValidate));
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
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_a235f6344s6226ceceff917096649123");
        
        pembukaanCustomerPerusahaan.setWebRequestCommon(webRequestCommon);
        pembukaanCustomerPerusahaan.setOfsFunction(ofsFunction);
        pembukaanCustomerPerusahaan.setCUSTOMERIDICORPSHORTR1TWSNType(customeridicorpshortr1twsnType);

        PembukaanCustomerPerusahaanResponse pembukaanCustomerPerusahaanResponse = soapClient.getCIFAuthor("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createPembukaanCustomerPerusahaan(pembukaanCustomerPerusahaan));
        System.out.println("CEK CEK "+ pembukaanCustomerPerusahaanResponse.getStatus().getSuccessIndicator());
        System.out.println("CEK CEK 2 "+ pembukaanCustomerPerusahaanResponse.getStatus().getMessages());
        
        return pembukaanCustomerPerusahaanResponse;
    }

    @PostMapping(value = "/validateMudharabah")
    public OpenAccountMudharabahValidateResponse validateEasyMudharabah(@RequestBody(required = true) CIFPerusahaan cifPerusahaan){
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountMudharabahValidate openAccountMudharabahValidate = new OpenAccountMudharabahValidate();
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = setACCOUNTIDIACMUDOPENR2TWSType(cifPerusahaan);

        WebRequestCommon webRequestCommon = new WebRequestCommon();
        // webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setUserName("TWSEXADEV");
        // webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setPassword("123123");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a05f6344c3226ceceff9170966494b6");
        
        openAccountMudharabahValidate.setWebRequestCommon(webRequestCommon);
        openAccountMudharabahValidate.setOfsFunction(ofsFunction);
        openAccountMudharabahValidate.setACCOUNTIDIACMUDOPENR2TWSType(accountidiacmudopenr2twsType);

        OpenAccountMudharabahValidateResponse openAccountMudharabahValidateResponse = soapClient.getOpenAccountMudharabah("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createOpenAccountMudharabahValidate(openAccountMudharabahValidate));
        
        return openAccountMudharabahValidateResponse;
    }

    @PostMapping(value = "/authorMudharabah")
    public OpenAccountMudharabahResponse authorEasyMudharabah(@RequestBody(required = true) CIFPerusahaan cifPerusahaan){
        ObjectFactory objectFactory = new ObjectFactory();
        OpenAccountMudharabah openAccountMudharabah = new OpenAccountMudharabah();
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = setACCOUNTIDIACMUDOPENR2TWSType(cifPerusahaan);

        WebRequestCommon webRequestCommon = new WebRequestCommon();
        webRequestCommon.setUserName("TWSDEV");
        webRequestCommon.setPassword("Bsi321");
        webRequestCommon.setCompany("ID0010001");

        OfsFunction ofsFunction = new OfsFunction();
        ofsFunction.setMessageId("EX20220215103647_9a6df6344c3226ceceff9170966994b6");
        
        openAccountMudharabah.setWebRequestCommon(webRequestCommon);
        openAccountMudharabah.setOfsFunction(ofsFunction);
        openAccountMudharabah.setACCOUNTIDIACMUDOPENR2TWSType(accountidiacmudopenr2twsType);
        
        OpenAccountMudharabahResponse openAccountMudharabahResponse = soapClient.getOpenAccountMudharabahAuthorization("http://10.0.147.139:8180/iBSM_TWS/services", objectFactory.createOpenAccountMudharabah(openAccountMudharabah));
        
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
        // customeridicorpshortr1twsnType.setGLEGALID(value);
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

    public ACCOUNTIDIACMUDOPENR2TWSType setACCOUNTIDIACMUDOPENR2TWSType(CIFPerusahaan cifPerusahaan){
        
        ACCOUNTIDIACMUDOPENR2TWSType accountidiacmudopenr2twsType = new ACCOUNTIDIACMUDOPENR2TWSType();
        
        // String
        accountidiacmudopenr2twsType.setACCTRECVBONUS("");
        accountidiacmudopenr2twsType.setACOPENPURPOSE("");
        accountidiacmudopenr2twsType.setAMNESTYFLAG("");
        accountidiacmudopenr2twsType.setAccountOfficer("");
        accountidiacmudopenr2twsType.setAlternateNumber("");
        accountidiacmudopenr2twsType.setCurrency("");
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
        accountidiacmudopenr2twsType.setNoCIF("");
        accountidiacmudopenr2twsType.setOTHACCPURPOSE("");
        accountidiacmudopenr2twsType.setOTHACCPURPOSE("");
        accountidiacmudopenr2twsType.setPOSTINGRESTRICT("");
        accountidiacmudopenr2twsType.setPassbook("");
        accountidiacmudopenr2twsType.setPrintedName("");
        accountidiacmudopenr2twsType.setProductCode("");
        accountidiacmudopenr2twsType.setQQNAME("");
        accountidiacmudopenr2twsType.setREFOUTSOURCE("");
        accountidiacmudopenr2twsType.setREFPROGRAM("");
        accountidiacmudopenr2twsType.setTAXABLE("");
        accountidiacmudopenr2twsType.setZAKAT("");

        // Non-String
        // accountidiacmudopenr2twsType.setGESERVICES("");
        // accountidiacmudopenr2twsType.setGJOINTHOLDER("");
        // accountidiacmudopenr2twsType.setGKETPAJAK("");

        return accountidiacmudopenr2twsType;
    } 
}
