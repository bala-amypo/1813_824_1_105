package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    User registerUser(UserDTO userDTO);
    List<User> getAllUsers();
}
