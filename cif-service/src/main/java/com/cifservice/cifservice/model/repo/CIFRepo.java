package com.cifservice.cifservice.model.repo;

import javax.transaction.Transactional;

import com.cifservice.cifservice.model.entity.CIFPerusahaan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
// @Repository
public interface CIFRepo extends JpaRepository<CIFPerusahaan, Integer> {

    CIFPerusahaan findById(String id);

    @Modifying
    @Query(value = " update new_reg_cif_corp c set c.cifno = ? where c.id = ? " , nativeQuery = true)
    int updateCIF(String cifNo, String id);

    @Modifying
    @Query(value = " update new_reg_cif_corp c set c.status = ? where c.id = ? " , nativeQuery = true)
    int updateStatus(String status, String id);

    @Modifying
    @Query(value = "update new_reg_cif_account u set u.USER_APPROVED_DATE  = ? where u.id = ?", nativeQuery = true)
    int updateCIFDate(String userApprovedDate, String id);

    @Modifying
    @Query(value = "update new_reg_cif_account u set u.USER_APPROVED_TIME = ? where u.id = ?", nativeQuery = true)
    int updateCIFTime(String userApprovedTime, String id);

}
