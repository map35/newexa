package com.cifservice.cifservice.service;

import com.cifservice.cifservice.model.entity.AccPerusahaan;
import com.cifservice.cifservice.model.repo.AccRepo;
import com.cifservice.cifservice.model.repo.CIFRepo;

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
}
