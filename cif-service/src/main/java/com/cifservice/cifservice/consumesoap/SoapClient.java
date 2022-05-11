package com.cifservice.cifservice.consumesoap;

import javax.xml.bind.JAXBElement;

import com.cifservice.cifservice.stub.OpenAccountMudharabahResponse;
import com.cifservice.cifservice.stub.OpenAccountMudharabahValidateResponse;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaanResponse;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaanValidateResponse;

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
}



