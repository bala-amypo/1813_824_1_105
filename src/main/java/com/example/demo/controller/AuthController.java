package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    public AuthController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestParam String username,
            @RequestParam String password) {

        User user = userService.authenticate(username, password);

        String token = jwtUtil.generateToken(
                user.getUsername(),
                user.getRole(),
                user.getId(),
                user.getEmail()
        );

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }
}
