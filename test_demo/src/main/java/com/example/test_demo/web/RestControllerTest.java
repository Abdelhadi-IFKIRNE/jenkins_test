package com.example.test_demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
    @GetMapping("/")
    public String getMessage(){
        return "jenkins work";
    }
}
