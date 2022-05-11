package com.newexa.employeeservice.controller;

import com.newexa.employeeservice.model.Employee;
import com.newexa.employeeservice.model.EmployeeChangePassword;
import com.newexa.employeeservice.response.ResponseHandler;
import com.newexa.employeeservice.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired EmployeeService employeeService;
    
    @PostMapping(value = "/register")
    public String saveStudent(@RequestBody(required = true) Employee employee){
        try {
            String hashedpassword = BCrypt.hashpw(employee.getPassword(), BCrypt.gensalt(12) );
            employee.setPassword(hashedpassword);
            boolean checkEmployee = employeeService.checkUsername(employee.getUsername());
            
            if(checkEmployee){
                return "Username cannot use";
            }

            Employee employeeSaved = employeeService.save(employee);
            if(employeeSaved != null){
                return "Register Successfully";
            }
            return "Register Unsuccessfully";
        } catch (Exception e) {
            System.out.println("exception" +e);
            return "Register Unsuccessfully";
        }
    }

    @PostMapping(value = "/checkusername")
    public boolean checkUsername(@RequestBody(required =  true) Employee employee){
        try{
            boolean employeeCheck = employeeService.checkUsername(employee.getUsername());
            if(employeeCheck){
                return true;
            }
            return false;

        }catch(Exception e){
            return false;
        }
    }

    @PostMapping(value = "/getuserdata")
    public Employee getUserData(@RequestBody(required =  true) Employee employee){
        try{
            System.out.println("emp "+ employee.getUsername());
            Employee employeeData = employeeService.getEmployeeData(employee);
            System.out.println("emp2 "+employeeData);
            if(employeeData != null){
                return employeeData;
            }
            return null;

        }catch(Exception e){
            return null;
        }
    }

    @PutMapping(value = "/resetpassword/{username_admin}")
    public ResponseEntity<Object> resetPassword(@RequestBody(required =  true) Employee employee, @PathVariable(required = true) String username_admin){
        try{
            Employee employeeSuperAdmin = employeeService.findByUsername(username_admin);
            System.out.println("Employee SuperAdmin "+ employeeSuperAdmin.getUsername());
            System.out.println("Employee SuperAdmin "+ employeeSuperAdmin.getRole());
            if(!employeeSuperAdmin.getRole().equals("SuperAdmin")){
                boolean is_success = false;
                return ResponseHandler.generateResponse("You aren't superadmin", HttpStatus.OK, true, is_success);
            }
            
            boolean checkEmployee = employeeService.checkUsername(employee.getUsername());
            // System.out.println(checkEmployee);
            if(!checkEmployee){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Employee not available", HttpStatus.OK, true, is_success);
            }
            boolean resetPassword = employeeService.resetPassword(employee);
            // System.out.println(employeeData);
            if(resetPassword){
                boolean is_success = true;
                return ResponseHandler.generateResponse("Reset password sucess!", HttpStatus.OK, true, is_success);
    
            }
            boolean is_success = false;
            return ResponseHandler.generateResponse("Reset password failed!", HttpStatus.OK, true, is_success);

        }catch(Exception e){
            boolean is_success = false;
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.OK, true, is_success);
        }
    }

    @PutMapping(value = "/changepassword")
    public ResponseEntity<Object> resetPassword(@RequestBody(required = true) EmployeeChangePassword employeeChangePassword){
        try{
            Employee employeeData = employeeService.findByUsername(employeeChangePassword.getUsername());
            // System.out.println(checkEmployee);
            if(employeeData  == null){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Employee not available", HttpStatus.OK, true, is_success);
            }

            if(employeeChangePassword.getNewPassword().length() < 8 ){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Password length must be 8 or more!", HttpStatus.OK, true, is_success);
            }
   
            boolean passCheck = BCrypt.checkpw(employeeChangePassword.getOldPassword(), employeeData.getPassword());
            if(!passCheck){
                boolean is_success = false;
                return ResponseHandler.generateResponse("Wrong password!", HttpStatus.OK, true, is_success);
            }

            boolean updatePassword = employeeService.changePassword(employeeChangePassword);
            // System.out.println(employeeData);
            if(updatePassword){
                boolean is_success = true;
                return ResponseHandler.generateResponse("Change password sucess!", HttpStatus.OK, true, is_success);
    
            }
            boolean is_success = false;
            return ResponseHandler.generateResponse("Change password failed!", HttpStatus.OK, true, is_success);

        }catch(Exception e){
            boolean is_success = false;
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.OK, true, is_success);
        }
    }
}

