package com.education_management_udemy.education_management_udemy.service;


import com.education_management_udemy.education_management_udemy.dto.LoginRequest;
import com.education_management_udemy.education_management_udemy.entity.Users;
import com.education_management_udemy.education_management_udemy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    public Boolean authenticateUser(LoginRequest loginRequest) {
        Optional<Users> userOptional = userRepository.findByEmail(loginRequest.getEmail());
        if (userOptional.isPresent()) {
            Users users = userOptional.get();
            if (passwordEncoder.matches(loginRequest.getPassword(), users.getPassword())) {
                return true;
            }else return false; // password not matches
        } else return false; //username not found
    }
}
