package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query(value = "update book set quantity=quantity-1 where id =id",nativeQuery = false)
    List<Book> creManage(@Param("id") int id);


}
