package com.example.book.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "manage")
public class ManageBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mamuon")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idBook")
    Book book;
    private String nameUser;
    private Date date;

    public ManageBook() {
    }

    public ManageBook(Integer id, Book book, String nameUser, Date date) {
        this.id = id;
        this.book = book;
        this.nameUser = nameUser;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
