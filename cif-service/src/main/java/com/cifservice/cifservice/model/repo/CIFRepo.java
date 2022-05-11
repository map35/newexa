package com.cifservice.cifservice.model.repo;

import javax.transaction.Transactional;

import com.cifservice.cifservice.model.entity.CIFPerusahaan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CIFRepo extends JpaRepository<CIFPerusahaan, Integer> {

    CIFPerusahaan findByTaxID(String taxID);

    @Modifying
    @Query(value = " update reg_cif_corp c set c.cifno = ? where c.id = ? " , nativeQuery = true)
    int updateCIF(String cifNo, String taxID);

    @Modifying
    @Query(value = " update reg_cif_corp c set c.status = ? where c.id = ? " , nativeQuery = true)
    int updateStatus(String status, String taxID);
}
