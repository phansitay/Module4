package codegym.email.service;

import codegym.email.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> findAll();
    void insert(Email email);

}
