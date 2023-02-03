package com.example.ontap.service;

import com.example.ontap.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> finAll();
    Book finById(int id);
    void save(Book book);
    void delete(int id);
    List<Book> search(String name);
}
