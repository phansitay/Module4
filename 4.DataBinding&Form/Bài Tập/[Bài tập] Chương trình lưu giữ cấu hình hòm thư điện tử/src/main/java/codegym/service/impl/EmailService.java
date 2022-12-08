package codegym.service.impl;

import codegym.model.Email;
import codegym.repository.IEmailRepository;
import codegym.repository.impl.EmailRepository;
import codegym.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("emailService")
public class EmailService implements IEmailService {

    @Autowired
    @Qualifier("emailService")
    private EmailRepository emailRepository;
    @Override
    public List<Email> getAll() {
        return emailRepository.getAll();
    }

    @Override
    public void save(Email email) {

    }
}
