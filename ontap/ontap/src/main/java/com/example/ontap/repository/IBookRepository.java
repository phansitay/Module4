package com.example.ontap.repository;

import com.example.ontap.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query(value = "select s from book as s where s.name like %:name%",nativeQuery = false)
    List<Book> findAllByName(@Param("name") String name);
}
