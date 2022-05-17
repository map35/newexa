package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.Province;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface ProvinceRepo extends JpaRepository<Province, Integer> {
    
    Province getById(String id);
}
