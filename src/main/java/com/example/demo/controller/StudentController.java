package com.example.demo.controller;

import com.example.demo.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {

    private List<Student> student = new ArrayList<>(List.of(
            new Student(1, "kiran", 60),
            new Student(2, "ghale", 80),
            new Student(3, "lama", 90),
            new Student(4, "gurung", 90)
    ));
    @GetMapping ("/")
    public List<Student> students() {
        return student;
    }


    @PostMapping("/")
    public Student addStudent(@RequestBody Student students) {
        student.add(students);
        return students;
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrftoken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
