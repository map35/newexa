package com.newexa.employeeservice.service;

import com.newexa.employeeservice.model.Employee;
import com.newexa.employeeservice.model.EmployeeChangePassword;


public interface EmployeeService {
    Employee save(Employee employee);
    boolean checkUsername(String username);
    Employee getEmployeeData(Employee employee);
    Employee findByUsername(String username);
    boolean resetPassword(Employee employee);
    boolean changePassword(EmployeeChangePassword employeeChangePassword);
}
