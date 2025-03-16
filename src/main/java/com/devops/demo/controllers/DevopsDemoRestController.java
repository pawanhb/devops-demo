package com.devops.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsDemoRestController {

    @GetMapping("/hello")
    public String helloMessage(){
        return "hello";
    }
}
