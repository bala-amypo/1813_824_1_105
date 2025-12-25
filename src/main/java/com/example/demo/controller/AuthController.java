package com.example.demo.controller;
import com.example.demo.service.UserService;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
@RequestController
@RequestMapping("/auth")
public class AuthController{
   @Autowired
   UserService obj;
   public User hello()
}
