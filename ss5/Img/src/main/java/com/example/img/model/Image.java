package com.example.img.model;

import javax.persistence.*;

@Entity(name="Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name ="author")
    private String author;
    @Column(name = "feedBack",columnDefinition = "text")
    private String feedback;

    public Image() {
    }

    public Image(int id, String author, String feedback) {
        this.id = id;
        this.author = author;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
