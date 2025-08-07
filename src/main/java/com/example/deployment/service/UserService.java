package com.example.deployment.service;

import com.example.deployment.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    User saveUser(User user);
}
