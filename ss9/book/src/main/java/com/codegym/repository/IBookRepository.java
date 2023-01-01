package com.codegym.repository;

import com.codegym.model.Book;
import com.codegym.model.Manage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book, Integer> {
    @Query("update book b set b.quantity  = b.quantity - 1 where b.id = :number ")
    void updateNumber(@Param("number") int number);

    @Query("update book b set b.quantity  = b.quantity + 1 where b.id = :id ")
    void updateNumbert(@Param("id") int id);
}
