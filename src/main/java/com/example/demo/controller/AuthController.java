package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @PostMapping("/register")
    public String register() {
        return "User Registered Successfully";
    }
}
