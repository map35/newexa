package com.newexa.loginservice.controller;

import com.newexa.loginservice.model.Employee;
import com.newexa.loginservice.model.Register;
import com.newexa.loginservice.response.ResponseHandler;
import com.newexa.loginservice.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired LoginService loginService;

    @PostMapping(value = "/")
    public ResponseEntity<Object> getEmployeeDataDetail(@RequestParam(required = true) String username, @RequestParam(required = true) String password){
        String username1 = username.strip();
        String password1 = password.strip();
        
        if(username1.isEmpty() || username1 == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Username cannot empty!", HttpStatus.OK, true, is_success);
        }

        if(password1.isEmpty() || password1 == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Password cannot empty!", HttpStatus.OK, true, is_success);
        }

    
        Employee employeeData = loginService.findByUsername(username1);

        if(employeeData==null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Username cannot found!", HttpStatus.OK, true, is_success);
        }
        
        Register register = new Register();
        register.setId(employeeData.getId());
        register.setRole(employeeData.getRole());
        register.setUsername(employeeData.getUsername());
        register.setAccessToken("0");
        return ResponseHandler.generateResponse("Login Success", HttpStatus.OK, true, register);

        // boolean passCheck = BCrypt.checkpw(password1, employeeData.getPassword());
        // if(passCheck){
        //     Register register = new Register();
        //     register.setId(employeeData.getId());
        //     register.setRole(employeeData.getRole());
        //     register.setUsername(employeeData.getUsername());
        //     register.setAccessToken("0");
        //     return ResponseHandler.generateResponse("Login Success", HttpStatus.OK, true, register);

        // }
        // boolean is_success = false;
        // return ResponseHandler.generateResponse("Wrong Password!", HttpStatus.OK, true, is_success);
    }
}
