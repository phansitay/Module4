package codegym.email.service;

import codegym.email.model.Email;
import codegym.email.repository.IEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("emailService")
public class EmailService implements IEmailService{
    @Autowired
    private IEmailRepository emailRepository;
    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }

    @Override
    public void insert(Email email) {
        emailRepository.save(email);
    }
}
