package com.twsservice.twsservice.consumesoap;

import javax.xml.bind.JAXBElement;

import com.twsservice.twsservice.stub.OpenAccountMudharabahResponse;
import com.twsservice.twsservice.stub.OpenAccountMudharabahValidateResponse;
import com.twsservice.twsservice.stub.PembukaanCustomerPerusahaanResponse;
import com.twsservice.twsservice.stub.PembukaanCustomerPerusahaanValidateResponse;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport{
    
    public PembukaanCustomerPerusahaanValidateResponse getCIFData (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (PembukaanCustomerPerusahaanValidateResponse) res.getValue();
    }
    
    public PembukaanCustomerPerusahaanResponse getCIFAuthor (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (PembukaanCustomerPerusahaanResponse) res.getValue();
    }

    public OpenAccountMudharabahValidateResponse getOpenAccountMudharabah (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenAccountMudharabahValidateResponse) res.getValue();
    }

    public OpenAccountMudharabahResponse getOpenAccountMudharabahAuthorization (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenAccountMudharabahResponse) res.getValue();
    }
}
