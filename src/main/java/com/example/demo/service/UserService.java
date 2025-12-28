package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserByUsername(String username);
}
