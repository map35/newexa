package com.newexa.employeeservice.repository;

import com.newexa.employeeservice.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee getByUsername(String username);

    @Modifying
    @Query(value = "update employee u set u.password = ? where u.username = ?", nativeQuery = true)
    int resetPassword(String password, String username);

    Employee findByUsername(String username);

    @Modifying
    @Query(value = "update employee u set u.password = ? where u.username = ?", nativeQuery = true)
    int changePassword(String password, String username);

}
