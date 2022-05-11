package com.newexa.employeeservice.service.impl;

import com.newexa.employeeservice.model.Employee;
import com.newexa.employeeservice.model.EmployeeChangePassword;
import com.newexa.employeeservice.repository.EmployeeRepository;
import com.newexa.employeeservice.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        // TODO Auto-generated method stub
         
        Employee employeeSaved = employeeRepository.save(employee);
        if(employeeSaved != null){
            return employeeSaved;
        }
 
        return employeeSaved;
    }

    @Override
    public boolean checkUsername(String username) {
        // TODO Auto-generated method stub
        try{
            Employee employeeData = employeeRepository.getByUsername(username);
            if(employeeData != null){
                return true;
            }
     
            return false;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
       
    }

    @Override
    public Employee getEmployeeData(Employee employee) {
        try{
            Employee employeeData = employeeRepository.getByUsername(employee.getUsername().strip());
            System.out.println(employeeData.getUsername());
            // TODO Auto-generated method stub
            if(employeeData != null){
                return employeeData;
            }
     
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public boolean resetPassword(Employee employee) {
        // TODO Auto-generated method stub
        String hashedpassword = BCrypt.hashpw(employee.getUsername(), BCrypt.gensalt(12) );
        employee.setPassword(hashedpassword);
        int employeeData = employeeRepository.resetPassword(employee.getPassword(), employee.getUsername());

        if(employeeData == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean changePassword(EmployeeChangePassword employeeChangePassword) {
        // TODO Auto-generated method stub
        String hashedpassword = BCrypt.hashpw(employeeChangePassword.getNewPassword(), BCrypt.gensalt(12) );
        employeeChangePassword.setNewPassword(hashedpassword);
        int employeeData = employeeRepository.changePassword(employeeChangePassword.getNewPassword(), employeeChangePassword.getUsername());

        if(employeeData == 1){
            return true;
        }
        return false;
    }

    @Override
    public Employee findByUsername(String username) {
        // TODO Auto-generated method stub
        Employee employeeData = employeeRepository.findByUsername(username);
        if(employeeData != null){
            return employeeData;
        }
        return null;
    }

    // @Override
    // public Employee findByUsername(String username) {
    //     // TODO Auto-generated method stub
    //     Employee employee = loginRepository.findByUsername(username);
    //     return employee;
    // }
    
}
