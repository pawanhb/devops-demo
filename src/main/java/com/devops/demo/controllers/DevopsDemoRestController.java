package com.devops.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsDemoRestController {

    @GetMapping("/hello1")
    public String helloMessage1(){
        return "hello";
    }

    @GetMapping("/hello12")
    public String helloMessage12(){
        return "hello";
    }

    @GetMapping("/hello123")
    public String helloMessage123(){
        return "hello";
    }

    @GetMapping("/hello1234")
    public String helloMessage1234(){
        return "hello";
    }
}
