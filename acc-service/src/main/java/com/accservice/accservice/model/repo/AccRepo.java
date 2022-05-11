package com.accservice.accservice.model.repo;

import javax.transaction.Transactional;

import com.accservice.accservice.model.entity.AccPerusahaan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface AccRepo extends JpaRepository<AccPerusahaan, Integer> {

    AccPerusahaan findByTaxID(String taxID);

    @Modifying
    @Query(value = " update reg_cif_account c set c.cifno = ? where c.id = ? " , nativeQuery = true)
    int updateAcc(String noAcc, String taxID);

    @Modifying
    @Query(value = " update reg_cif_account c set c.status = ? where c.id = ? " , nativeQuery = true)
    int updateStatus(String status, String taxID);
}