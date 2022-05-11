package com.region.model.repo;

import java.util.List;

import com.region.model.entity.KabKota;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KabKotaRepo extends JpaRepository<KabKota, Integer> {
   
    // int kode_provinsi 
    List<KabKota> getByKodeProvinsi(int kode_provinsi);
}
