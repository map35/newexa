package com.accservice.accservice.model.repo;

import javax.transaction.Transactional;

import com.accservice.accservice.model.entity.CIFPerusahaan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CIFRepo extends JpaRepository<CIFPerusahaan, Integer> {

    
}
