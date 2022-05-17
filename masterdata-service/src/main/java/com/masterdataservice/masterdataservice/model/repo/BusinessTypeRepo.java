package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.BusinessType;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface BusinessTypeRepo extends JpaRepository<BusinessType, Integer>{
    
}
