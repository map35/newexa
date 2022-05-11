package com.accservice.accservice.service;

import com.accservice.accservice.model.entity.AccPerusahaan;
import com.accservice.accservice.model.repo.AccRepo;
import com.accservice.accservice.model.repo.CIFRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccService {
    
    @Autowired CIFRepo cifRepo;
    @Autowired AccRepo accRepo;
    @Autowired RestTemplate restTemplate;

    public AccPerusahaan save(AccPerusahaan accPerusahaan){
        AccPerusahaan accData = accRepo.save(accPerusahaan);
        if(accData != null){
            return accData;
        }
        return null;
    }

    public AccPerusahaan findByTaxID(String taxID){
        // System.out.println("controller "+ cifPerusahaan.getTaxID());
        AccPerusahaan accData = accRepo.findByTaxID(taxID);
        if(accData != null){
            return accData;
        }
        return null;
    }

    public boolean updateNoAcc(AccPerusahaan accPerusahaan){
        int updateAcc = accRepo.updateAcc(accPerusahaan.getAccNo(), accPerusahaan.getTaxID());
        if(updateAcc == 1){
            return true;
        }
        return false;
    }

    public boolean updateStatus(AccPerusahaan accPerusahaan){
        int updateStatus = accRepo.updateStatus(accPerusahaan.getStatus(), accPerusahaan.getTaxID());
        if(updateStatus == 1){
            return true;
        }
        return false;
    }
}