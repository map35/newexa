package com.accservice.accservice.consumesoap;

import javax.xml.bind.JAXBElement;

import com.accservice.accservice.stub.OpenAccountMudharabahResponse;
import com.accservice.accservice.stub.OpenAccountMudharabahValidateResponse;
import com.accservice.accservice.stub.PembukaanCustomerPerusahaanResponse;
import com.accservice.accservice.stub.PembukaanCustomerPerusahaanValidateResponse;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport{
    
    public OpenAccountMudharabahValidateResponse getOpenAccountMudharabah (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenAccountMudharabahValidateResponse) res.getValue();
    }

    public OpenAccountMudharabahResponse getOpenAccountMudharabahAuthorization (String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (OpenAccountMudharabahResponse) res.getValue();
    }
}
