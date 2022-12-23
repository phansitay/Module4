package com.example.book.service;

import com.example.book.model.ManageBook;
import com.example.book.repository.IManageBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageBookService implements IManageBookService{
    @Autowired
    private IManageBookRepository manageBookRepository;
    @Override
    public List<ManageBook> finAll() {
        return manageBookRepository.findAll();
    }

    @Override
    public ManageBook finById(int id) {
        return manageBookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ManageBook manageBook) {
        manageBookRepository.save(manageBook);
    }

    @Override
    public void delete(ManageBook manageBook) {
        manageBookRepository.delete(manageBook);
    }
}
