package com.education_management_udemy.education_management_udemy.service;

import com.education_management_udemy.education_management_udemy.entity.Course;
import com.education_management_udemy.education_management_udemy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {


    @Autowired
    private CourseRepository courseRepository;


    public void addCourse(Course course) {
        System.out.println(course.getCategory());
        System.out.println(course.getDescription());
        System.out.println(course.getThumbnail());
        System.out.println(course.getTitle());
        System.out.println(course.getTeacherId());
        System.out.println(course.getCategory());
        courseRepository.save(course);
    }

    public List<Course> getAllCourseDetails() {
        return  courseRepository.findAll();
    }


    public Optional<Course> getCourseById(long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isPresent()){
            return course;
        }else return course = null;
    }
}
