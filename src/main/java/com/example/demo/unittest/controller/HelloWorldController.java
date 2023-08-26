package com.example.demo.unittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/esraa")
    public String helloWorld(){
        return "Hello esraa";
    }
}
