package com.example.springdemo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Test message, your session id: " + request.getSession().getId();
    }
}
