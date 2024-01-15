package com.example.services;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
