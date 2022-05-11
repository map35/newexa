package com.cifservice.cifservice.service;

import com.cifservice.cifservice.model.entity.CIFPerusahaan;
import com.cifservice.cifservice.model.repo.AccRepo;
import com.cifservice.cifservice.model.repo.CIFRepo;
import com.cifservice.cifservice.stub.PembukaanCustomerPerusahaanValidateResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CIFService {
    
    @Autowired CIFRepo cifRepo;
    @Autowired AccRepo accRepo;
    @Autowired RestTemplate restTemplate;

    public CIFPerusahaan save(CIFPerusahaan cifPerusahaan){
        CIFPerusahaan cifData = cifRepo.save(cifPerusahaan);
        if(cifData != null){
            return cifData;
        }
        return null;
    }

    public CIFPerusahaan findByTaxID(String taxID){
        // System.out.println("controller "+ cifPerusahaan.getTaxID());
        CIFPerusahaan cifData = cifRepo.findByTaxID(taxID);
        if(cifData != null){
            return cifData;
        }
        return null;
    }

    public boolean updateNoCIF(CIFPerusahaan cifPerusahaan){
        int updateCIF = cifRepo.updateCIF(cifPerusahaan.getCifNo(), cifPerusahaan.getTaxID());
        if(updateCIF == 1){
            return true;
        }
        return false;
    }

    public boolean updateStatus(CIFPerusahaan cifPerusahaan){
        int updateStatus = cifRepo.updateStatus(cifPerusahaan.getStatus(), cifPerusahaan.getTaxID());
        if(updateStatus == 1){
            return true;
        }
        return false;
    }
    
    // public CIFPerusahaan save(CIFPerusahaan cifPerusahaan) {
        
    //     CIFPerusahaan cifSaved = cifRepo.save(cifPerusahaan);
    //     if(cifSaved != null){
    //         return cifSaved;
    //     }
    //     return null;
    // }

    // public CIFPerusahaan findById(CIFPerusahaan cifPerusahaan) {
        
    //     CIFPerusahaan cifPerusahaanData = cifRepo.findById(cifPerusahaan.getId());
    //     if(cifPerusahaanData != null){
    //         return cifPerusahaanData;
    //     }
    //     return null;
    // }

    // public boolean updateNoCIF(CIFPerusahaan cifPerusahaan) {
        
    //     int cifUpdate = cifRepo.updateCIFNumber(CIFPerusahaan.getCIF(), CIFPerusahaan.getId());
    //     if(cifUpdate == 1){
    //         return true;
    //     }
    //     return false;
    // }
    
    // public boolean updateStatusCIF(CIFPerusahaan cifPerusahaan) {
        
    //     int cifUpdate = cifRepo.updateCIFStatus(cifPerusahaan.getCIF(), cifPerusahaan.getId());
    //     if(cifUpdate == 1){
    //         return true;
    //     }
    //     return false;
    // }

    public PembukaanCustomerPerusahaanValidateResponse validateCIF(CIFPerusahaan CIFPerusahaan) {

        PembukaanCustomerPerusahaanValidateResponse cifPerusahaanDataValidateResponse = restTemplate.postForObject(  "http://localhost:9099/tws/validateCIF", CIFPerusahaan, PembukaanCustomerPerusahaanValidateResponse.class);
        return cifPerusahaanDataValidateResponse;
    }
}
