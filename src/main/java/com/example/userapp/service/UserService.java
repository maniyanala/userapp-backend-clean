package com.example.userapp.service;

import com.example.userapp.model.User;
import com.example.userapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    // GET
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    // POST
    public User saveUser(User user) {
        return repo.save(user);
    }
}
