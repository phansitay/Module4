package com.example.book.repository;

import com.example.book.model.ManageBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IManageBookRepository extends JpaRepository<ManageBook, Integer> {
}
