package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.Sector;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface SectorRepo extends JpaRepository<Sector, Integer> {
    
}
