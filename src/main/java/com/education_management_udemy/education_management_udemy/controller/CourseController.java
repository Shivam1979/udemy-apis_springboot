package com.education_management_udemy.education_management_udemy.controller;


import com.education_management_udemy.education_management_udemy.entity.Course;
import com.education_management_udemy.education_management_udemy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/course")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        if (course != null) {
            courseService.addCourse(course);
            return new ResponseEntity<>(course, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getCourse")
    public ResponseEntity<List<Course>> getCourses() {
        List<Course> courses = courseService.getAllCourseDetails();
        if (courses != null && !courses.isEmpty()) {
            return new ResponseEntity<>(courses, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
