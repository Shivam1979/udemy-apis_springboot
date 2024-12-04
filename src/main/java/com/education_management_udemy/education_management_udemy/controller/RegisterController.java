package com.education_management_udemy.education_management_udemy.controller;
import com.education_management_udemy.education_management_udemy.dto.Register;
import com.education_management_udemy.education_management_udemy.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class RegisterController{

     @Autowired
     private RegisterService registerService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Register register){
        if (registerService.registerUser(register)){
            return new ResponseEntity<>("Registration sucessfull ..",HttpStatus.CREATED);
        }else return new ResponseEntity<>("Registration Failed...",HttpStatus.BAD_REQUEST);
    }
}
