package com.accservice.accservice.service;

import java.util.List;

import com.accservice.accservice.model.entity.AccPerusahaan;
import com.accservice.accservice.model.repo.AccRepo;
import com.accservice.accservice.model.repo.CIFRepo;
import com.accservice.accservice.stub.OpenAccountMudharabahValidateResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

    public AccPerusahaan findById(AccPerusahaan accPerusahaan){
        // System.out.println("controller "+ cifPerusahaan.getTaxID());
        AccPerusahaan accData = accRepo.findById(accPerusahaan.getId());
        if(accData != null){
            return accData;
        }
        return null;
    }

    public boolean updateAccNo(AccPerusahaan accPerusahaan){
        int updateAcc = accRepo.updateAccNo(accPerusahaan.getAccNo(), accPerusahaan.getId());
        if(updateAcc == 1){
            return true;
        }
        return false;
    }

    public boolean updateAccStatus(AccPerusahaan accPerusahaan){
        int updateStatus = accRepo.updateAccStatus(accPerusahaan.getStatus(), accPerusahaan.getId());
        if(updateStatus == 1){
            return true;
        }
        return false;
    }

    public boolean updateCIFNo(AccPerusahaan AccPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateCIFNo(AccPerusahaan.getCifNo(), AccPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateAccDate(AccPerusahaan AccPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateUserApprovedDate(AccPerusahaan.getUserApprovedDate(), AccPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateAccTime(AccPerusahaan AccPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateUserApprovedTime(AccPerusahaan.getUserApprovedTime(), AccPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateUserApprovedByName(AccPerusahaan AccPerusahaan2) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateUserApprovedByName(AccPerusahaan2.getUserApprovedByName(), AccPerusahaan2.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public List<AccPerusahaan> getallaccount(String acOpenPurpose, String productCode, String status, String cifNo, String dateofStart, String dateofFinish) {
        // TODO Auto-generated method stub
        Sort dateSort = Sort.by("userCreatedDate").and(Sort.by("userCreatedTime")).descending(); 
        
        List<AccPerusahaan> accPerusahaans = accRepo.findAllData(
            acOpenPurpose,
            productCode,
            status,
            cifNo,
            dateofStart,
            dateofFinish);

        System.out.println(accPerusahaans);

        if(accPerusahaans == null){
            return null;
        }
        // if(AccPerusahaans.size()>0){
        return accPerusahaans;
        // }
        // return null;
    }

    public boolean updateAccountNo(AccPerusahaan accPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateAccNo(accPerusahaan.getAccNo(), accPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateAccountStatus(AccPerusahaan accPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateAccStatus(accPerusahaan.getStatus(), accPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateCIFNumber(AccPerusahaan accPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateCIFNo(accPerusahaan.getCifNo(), accPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateAccountDate(AccPerusahaan accPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateUserApprovedDate(accPerusahaan.getUserApprovedDate(), accPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

    public boolean updateAccountTime(AccPerusahaan accPerusahaan) {
        // TODO Auto-generated method stub
        int AccPerusahaanValue= accRepo.updateUserApprovedTime(accPerusahaan.getUserApprovedTime(), accPerusahaan.getId());

        if(AccPerusahaanValue == 1){
            return true;
        }
        return false;
    }

}