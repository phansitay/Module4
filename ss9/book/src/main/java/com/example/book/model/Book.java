package com.example.book.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String author;
    private int quantity;
    @OneToMany(mappedBy = "book")
    Set<ManageBook> manageBooks;

    public Book() {
    }

    public Book(Integer id, String name, String author, int quantity, Set<ManageBook> manageBooks) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.manageBooks = manageBooks;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<ManageBook> getManageBooks() {
        return manageBooks;
    }

    public void setManageBooks(Set<ManageBook> manageBooks) {
        this.manageBooks = manageBooks;
    }
}