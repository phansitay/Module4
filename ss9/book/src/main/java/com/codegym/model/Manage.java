package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "manage")
public class Manage {
    @Id
    //tự động tăng
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(255)")
    private String name;
    @ManyToOne
    @JoinColumn(name = "idBook")
    Book book;

    public Manage() {
    }

    public Manage(Integer id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
