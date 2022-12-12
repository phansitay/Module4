package com.example.email.service;

import com.example.email.model.Email;
import com.example.email.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("emailService")
public class EmailService implements IEmailService{
    @Autowired
    private IEmailRepository emailRepository;
    @Override
    public List<Email> finAll() {
        return emailRepository.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void save(Email email) {
        emailRepository.save(email);
    }

    @Override
    public void finById(int id) {
        emailRepository.findById(id);
    }
}
