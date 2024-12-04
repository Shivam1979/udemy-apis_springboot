package com.education_management_udemy.education_management_udemy.controller;

import com.education_management_udemy.education_management_udemy.dto.LoginRequest;
import com.education_management_udemy.education_management_udemy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {


    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest){
        System.out.println(loginRequest.getEmail());
        System.out.println(loginRequest.getPassword());
        if (loginService.authenticateUser(loginRequest)){
            return new ResponseEntity<>("Login Successful...", HttpStatus.OK);
        }
        return new ResponseEntity<>("Invalid email or password...", HttpStatus.UNAUTHORIZED);
    }

}

