package com.example.book.service;

import com.example.book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> finAll();
    Book finById(int id);
    void save(Book book);
    void delete(int id);
    List<Book>creManage(int id);
}
