package com.cifservice.cifservice.model.repo;

import javax.transaction.Transactional;

import com.cifservice.cifservice.model.entity.AccPerusahaan;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface AccRepo extends JpaRepository<AccPerusahaan, Integer> {
    
    AccPerusahaan findById(String id);
}
