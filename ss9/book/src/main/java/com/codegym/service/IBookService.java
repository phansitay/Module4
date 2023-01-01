package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.model.Manage;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    void save(Book book);
    Book getBookById(int id);
    void delete(int id);
    void updateNumber(int number);
    void updateNumbert(int id);
}
