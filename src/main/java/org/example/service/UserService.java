package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(long id, User user);

    void deleteById(long id);
}