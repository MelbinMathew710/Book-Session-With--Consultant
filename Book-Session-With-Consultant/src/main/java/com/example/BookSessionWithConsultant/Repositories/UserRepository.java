package com.example.BookSessionWithConsultant.Repositories;

import com.example.BookSessionWithConsultant.Models.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();
    private Long userIdCounter = 1L;

    public User save(User user) {
        user.setId(userIdCounter++);
        users.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public Optional<User> findByEmail(String email) {
        return users.values()
                .stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst();
    }

    public Map<Long, User> getAllUsers() {
        return users;
    }
}