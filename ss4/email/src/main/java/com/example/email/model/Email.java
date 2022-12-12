package com.example.email.model;

import javax.persistence.*;

@Entity(name="email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name ="language")
    private String language;
    @Column(name = "size")
    private int size;
    @Column(name = "spam",columnDefinition = "boolean")
    private boolean spam;
    @Column(name = "signature",columnDefinition = "text")
    private String signature;

    public Email() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
