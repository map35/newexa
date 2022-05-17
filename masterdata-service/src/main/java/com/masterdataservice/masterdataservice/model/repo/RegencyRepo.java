package com.masterdataservice.masterdataservice.model.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.Regency;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface RegencyRepo extends JpaRepository<Regency, Integer> {
    
    List<Regency> getByprovinceId(String provinceId);

    Regency getById(String id);
}
