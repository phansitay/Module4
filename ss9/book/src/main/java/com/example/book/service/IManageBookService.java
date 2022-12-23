package com.example.book.service;

import com.example.book.model.ManageBook;

import java.util.List;

public interface IManageBookService {
    List<ManageBook>finAll();
    ManageBook finById(int id);
    void save(ManageBook manageBook);
    void delete(ManageBook manageBook);
}
