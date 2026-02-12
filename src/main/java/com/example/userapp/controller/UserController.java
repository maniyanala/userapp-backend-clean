package com.example.userapp.controller;

import com.example.userapp.model.User;
import com.example.userapp.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "https://userapp-frontend-clean.onrender.com")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // GET all users
    @GetMapping("/all")
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    // POST new user
    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.saveUser(user); // Saves to MongoDB
    }
}
