package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public List<Book> finAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book finById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}
