package codegym.service;

import codegym.model.Email;

import java.util.List;

public interface IEmailService {
    List<Email> getAll();

    void save(Email email);

//    Student findById(Integer codeStudent);
}
