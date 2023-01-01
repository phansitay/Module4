package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.model.Manage;

import java.util.List;

public interface IManageService {
    List<Manage> finAll();
    Manage findById(int id);
    void save(Manage manage);
    void delete(int id);
}
