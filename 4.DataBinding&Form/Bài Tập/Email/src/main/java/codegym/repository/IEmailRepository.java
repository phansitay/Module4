package codegym.repository;

import codegym.model.Email;

import java.util.List;

public interface IEmailRepository {
    List<Email> getAll();

    void save(Email email);

//    Student findById(Integer codeStudent);
}
