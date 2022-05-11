package com.negara.negaraservice.service;

import javax.transaction.Transactional;

import com.negara.negaraservice.model.entity.Negara;
import com.negara.negaraservice.model.repo.NegaraRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NegaraService {
    
    @Autowired
    private NegaraRepo negaraRepo;

    public Negara save(Negara negara){
        return negaraRepo.save(negara);
    }

    public Iterable<Negara> findAll(){
        return negaraRepo.findAll();
    }
}
