package com.provinsi.provinsiservice.service;

import javax.transaction.Transactional;

import com.provinsi.provinsiservice.model.entity.Provinsi;
import com.provinsi.provinsiservice.model.repo.ProvinsiRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProvinsiService {
    
    @Autowired
    private ProvinsiRepo provinsiRepo;

    public Provinsi save(Provinsi provinsi){
        return provinsiRepo.save(provinsi);
    }

    public Iterable<Provinsi> findAll(){
        return provinsiRepo.findAll();
    }
}
