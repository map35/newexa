package com.negara.negaraservice.model.repo;

import com.negara.negaraservice.model.entity.Negara;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NegaraRepo extends JpaRepository<Negara, Integer>{
    
}
