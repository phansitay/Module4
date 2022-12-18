package com.example.formdangki.service;

import com.example.formdangki.model.User;

import java.util.List;

public interface IUserService {
    List<User> finAll();
    void insert(User user);
    void delete(int id);
    User finById(int id);
}
