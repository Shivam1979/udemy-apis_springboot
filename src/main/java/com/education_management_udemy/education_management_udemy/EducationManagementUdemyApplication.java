package com.education_management_udemy.education_management_udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:3000")
@SpringBootApplication
public class EducationManagementUdemyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducationManagementUdemyApplication.class, args);
	}

}
