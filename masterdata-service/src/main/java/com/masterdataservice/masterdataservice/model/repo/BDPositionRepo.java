package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.BDPosition;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface BDPositionRepo extends JpaRepository<BDPosition, Integer>{
    
}
