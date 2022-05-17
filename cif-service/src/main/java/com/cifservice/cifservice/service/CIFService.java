package com.cifservice.cifservice.service;

import com.cifservice.cifservice.model.entity.CIFPerusahaan;
import com.cifservice.cifservice.model.entity.Employee;
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

    public CIFPerusahaan findById(CIFPerusahaan cifPerusahaan){
        // System.out.println("controller "+ cifPerusahaan.getTaxID());
        CIFPerusahaan cifData = cifRepo.findById(cifPerusahaan.getId());
        if(cifData != null){
            return cifData;
        }
        return null;
    }

    public boolean updateNoCIF(CIFPerusahaan cifPerusahaan){
        int updateCIF = cifRepo.updateCIF(cifPerusahaan.getCifNo(), cifPerusahaan.getId());
        if(updateCIF == 1){
            return true;
        }
        return false;
    }

    public boolean updateStatus(CIFPerusahaan cifPerusahaan){
        int updateStatus = cifRepo.updateStatus(cifPerusahaan.getStatus(), cifPerusahaan.getId());
        if(updateStatus == 1){
            return true;
        }
        return false;
    }

    // public Employee findByUsername(String username) {
    //     // TODO Auto-generated method stub
    //     Employee employee = new Employee();
    //     employee.setUsername(username);
    //     System.out.println("cek cek "+username);
    //     Employee employeeData = restTemplate.postForObject(  "http://localhost:9003/employee/getuserdata", employee, Employee.class);
    //     return employeeData;
    // }

    // public PembukaanCustomerPerusahaanValidateResponse validateCIF(CIFPerusahaan CIFPerusahaan) {

    //     PembukaanCustomerPerusahaanValidateResponse cifPerusahaanDataValidateResponse = restTemplate.postForObject(  "http://localhost:9099/tws/validateCIF", CIFPerusahaan, PembukaanCustomerPerusahaanValidateResponse.class);
    //     return cifPerusahaanDataValidateResponse;
    // }
}
