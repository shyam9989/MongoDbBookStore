package com.example.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/jenkins")
    public String testJenkins(){
        return "jenkins working";
    }
    
}
