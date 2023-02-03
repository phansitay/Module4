package com.example.ontap.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 5, max = 45,message = "Tên phải dài hơn {min} kí tự và ngắn hay {max} kí tự")
    private String name;
    private String author;

    @Min(1)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "idCategory")
    Category category;
    @Column(name = "content", columnDefinition = "text")
    private String content;

    public Book() {
    }

    public Book(Integer id, String name, String author, int quantity, Category category, String content) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.category = category;
        this.content = content;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
