package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.Segment;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface SegmentRepo extends JpaRepository<Segment, Integer>{
    
}
