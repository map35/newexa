package com.cifservice.cifservice.service;

import com.cifservice.cifservice.model.entity.AccPerusahaan;
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
        System.out.println("controller "+ cifRepo.findById(cifPerusahaan.getId()));
        CIFPerusahaan cifData = cifRepo.findById(cifPerusahaan.getId());
        // System.out.println("controller "+ cifData.getTaxID());

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

    public boolean updateDate(CIFPerusahaan cifPerusahaan) {
        int updatecif = cifRepo.updateCIFDate(cifPerusahaan.getUserApprovedDate(), cifPerusahaan.getId());
        if(updatecif == 1){
            return true;
        }
        return false;
    }

    public boolean updateTime(CIFPerusahaan cifPerusahaan) {
        int updatecif = cifRepo.updateCIFTime(cifPerusahaan.getUserApprovedTime(), cifPerusahaan.getId());
        if(updatecif == 1){
            return true;
        }
        return false;
    }

    public Boolean authorMudharabahAccount(AccPerusahaan accPerusahaan) {
        // TODO Auto-generated method stub
        Boolean openAccountMudharabahResponse = restTemplate.postForObject(  "http://localhost:9002/acc/authormudharabahaccountwithcif", accPerusahaan, Boolean.class);
        return openAccountMudharabahResponse;
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
