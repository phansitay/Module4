package codegym.repository.impl;


import codegym.model.Email;
import codegym.repository.IEmailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepository implements IEmailRepository {
    static List<Email> emails = new ArrayList<>();

    static {
        emails.add( new Email("Englist",30,true,"hello"));
        emails.add( new Email("Japanese",10,true,"keajjs"));
        emails.add( new Email("Vietnames",55,true,"xin chào"));
        emails.add( new Email("Chinese",10,true,"hello"));
        emails.add( new Email("Japanese",30,true,"hello"));
    }


    @Override
    public List<Email> getAll() {
        return emails;
    }

    @Override
    public void save(Email email) {

    }
}
