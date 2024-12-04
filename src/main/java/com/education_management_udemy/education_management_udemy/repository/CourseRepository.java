package com.education_management_udemy.education_management_udemy.repository;

import com.education_management_udemy.education_management_udemy.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
