package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.model.Manage;
import com.codegym.repository.IManageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("categoryService")
public class ManageService implements IManageService {
    @Autowired
    IManageRepository manageRepository;

    @Override
    public List<Manage> finAll() {
        return manageRepository.findAll();
    }

    @Override
    public Manage findById(int id) {
        return manageRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Manage manage) {
        manageRepository.save(manage);
    }

    @Override
    public void delete(int id) {
        manageRepository.deleteById(id);
    }

}
