package com.example.BookSessionWithConsultant.Services;

import com.example.BookSessionWithConsultant.Models.User;
import com.example.BookSessionWithConsultant.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Map<Long, User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}