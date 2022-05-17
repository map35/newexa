package com.accservice.accservice.model.repo;

import java.util.List;

import javax.transaction.Transactional;

import com.accservice.accservice.model.entity.AccPerusahaan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface AccRepo extends JpaRepository<AccPerusahaan, Integer> {

    AccPerusahaan findById(String id);

    @Modifying
    @Query(value = " update reg_cif_account c set c.accno = ? where c.id = ? " , nativeQuery = true)
    int updateAccNo(String noAcc, String id);

    @Modifying
    @Query(value = " update reg_cif_account c set c.status = ? where c.id = ? " , nativeQuery = true)
    int updateAccStatus(String status, String id);

    @Modifying
    @Query(value = "update reg_account u set u.CIFNO = ? where u.ID = ?", nativeQuery = true)
    int updateCIFNo(String CIFNO, String ID);

    @Modifying
    @Query(value = "update reg_account u set u.USER_APPROVED_TIME = ? where u.ID = ?", nativeQuery = true)
    int updateUserApprovedTime(String userApprovedTime, String id);

    @Modifying
    @Query(value = "update reg_account u set u.USER_APPROVED_DATE = ? where u.ID = ?", nativeQuery = true)
    int updateUserApprovedDate(String userApprovedDate, String id);

    @Modifying
    @Query(value = "update reg_account u set u.	USER_APPROVED_BY_NAME = ? where u.ID = ?", nativeQuery = true)
    int updateUserApprovedByName(String userApprovedByName, String id);

    // @Query(value = "SELECT * FROM new_reg_cif_account", nativeQuery = true)
    // List<AccPerusahaan> findAllData(String acOpenPurpose, String product, String status, String cifNo, String dateofStart, String dateofFinish);

    @Query(value = "SELECT * FROM new_reg_cif_account u WHERE ACOPENPURPOSE = IFNULL(?1, u.ACOPENPURPOSE) AND u.PRODUCTCODE = IFNULL(?2, u.PRODUCTCODE) AND u.STATUS = IFNULL(?3, u.STATUS) AND u.CIFNO = IFNULL(?4, u.CIFNO) AND u.USER_CREATED_DATE BETWEEN IFNULL(?5, u.USER_CREATED_DATE) AND IFNULL(?6, u.USER_CREATED_DATE) ORDER BY u.ID DESC, u.USER_CREATED_TIME DESC", nativeQuery = true)
    List<AccPerusahaan> findAllData(String acOpenPurpose, String productCode, String status, String cifNo, String dateofStart, String dateofFinish);

}