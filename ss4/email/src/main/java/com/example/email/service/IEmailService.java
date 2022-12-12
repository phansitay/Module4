package com.example.email.service;

import com.example.email.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> finAll();
    void delete(int id);
    void save(Email email);
    void finById(int id);
}
