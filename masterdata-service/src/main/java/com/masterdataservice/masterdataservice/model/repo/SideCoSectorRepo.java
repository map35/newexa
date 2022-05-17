package com.masterdataservice.masterdataservice.model.repo;

import javax.transaction.Transactional;

import com.masterdataservice.masterdataservice.model.entity.SideCoSector;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface SideCoSectorRepo extends JpaRepository<SideCoSector, Integer>{

}
