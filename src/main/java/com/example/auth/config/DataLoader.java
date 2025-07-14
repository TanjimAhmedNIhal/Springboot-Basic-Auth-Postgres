package com.example.auth.config;

import com.example.auth.model.User;
import com.example.auth.repository.UserRepository;
import com.example.auth.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostConstruct
    public void loadUsers() {
        if (userRepository.findByUsername("intern") == null) {
            userService.save(new User("intern", "password123", "USER"));
        }
        if (userRepository.findByUsername("admin") == null) {
            userService.save(new User("admin", "admin123", "ADMIN"));
        }
    }
}
