package com.education_management_udemy.education_management_udemy.service;


import com.education_management_udemy.education_management_udemy.dto.Register;
import com.education_management_udemy.education_management_udemy.entity.Users;
import com.education_management_udemy.education_management_udemy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public  boolean registerUser(Register register) {
    try {
        Users users =  new Users();
            users.setFirst_name(register.getFirst_name());
            users.setLast_name(register.getLast_name());
            users.setEmail(register.getEmail());
            users.setPassword(passwordEncoder.encode(register.getPassword()));
            users.setRole(register.getRole());
            usersRepository.save(users);
            return true;
        }catch (Exception e){
        e.printStackTrace();
        return false;
    }
    }
}
