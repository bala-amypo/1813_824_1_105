package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {

    // Dummy in-memory user
    private final User user =
            new User(1L, "admin", "$2a$10$7Qx5eGxvY4fY9y1pYyFJRe9wE6kR3y0mTj2mXJ0uY5xq7Yz");

    public Optional<User> findByUsername(String username) {
        if (user.getUsername().equals(username)) {
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
