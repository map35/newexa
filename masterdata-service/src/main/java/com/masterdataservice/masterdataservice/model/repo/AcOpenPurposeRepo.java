package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.AcOpenPurpose;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface AcOpenPurposeRepo extends JpaRepository<AcOpenPurpose, Integer> {
    
}
