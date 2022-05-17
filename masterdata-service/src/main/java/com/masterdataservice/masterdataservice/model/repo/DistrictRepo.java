package com.masterdataservice.masterdataservice.model.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.District;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface DistrictRepo extends JpaRepository<District, Integer> {
    
    List<District> getByregencyId(String regencyId);

    District getById(String id);
}
