package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    private int quantity;
    @OneToMany(mappedBy = "book")
    private Set<Manage> manages;

    public Book() {
    }

    public Book(Integer id, String name, int quantity, Set<Manage> manages) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.manages = manages;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Manage> getManages() {
        return manages;
    }

    public void setManages(Set<Manage> manages) {
        this.manages = manages;
    }
}
