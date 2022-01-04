package com.javaspringsecurity.tutorial.controller;

import com.javaspringsecurity.tutorial.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            Student.builder().id(101).name("James Bond").build(),
            Student.builder().id(102).name("Maria Jones").build(),
            Student.builder().id(103).name("Anna Smith").build()
    );

    @GetMapping(path = "/{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return STUDENTS.stream().filter(student -> studentId.equals(student.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exist"));
    }

}
