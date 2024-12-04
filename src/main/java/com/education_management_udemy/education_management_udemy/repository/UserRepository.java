package com.education_management_udemy.education_management_udemy.repository;

import com.education_management_udemy.education_management_udemy.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
}
