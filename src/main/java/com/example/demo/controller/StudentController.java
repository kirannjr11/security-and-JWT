package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @GetMapping ("/")
    public String student(HttpServletRequest request) {
        return "i am student" +" " +request.getSession().getId();
    }
}
