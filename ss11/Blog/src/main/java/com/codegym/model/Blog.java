package com.codegym.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "blog")
public class Blog {
    @Id
    //tự động tăng
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nameBlog", columnDefinition = "VARCHAR(255)")
    private String nameBlog;
    @Column(name="author",columnDefinition = "VARCHAR(50)")
    private  String authorBlog;
    @ManyToOne
    @JoinColumn(name = "idCategory")
    Category category;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datePublish;
    @Column(name = "content",columnDefinition = "text")
    private String contentBlog;


    public Blog() {
    }

    public Blog(Integer id, String nameBlog, String authorBlog, Category category, Date datePublish, String contentBlog) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.authorBlog = authorBlog;
        this.category = category;
        this.datePublish = datePublish;
        this.contentBlog = contentBlog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getAuthorBlog() {
        return authorBlog;
    }

    public void setAuthorBlog(String authorBlog) {
        this.authorBlog = authorBlog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public String getContentBlog() {
        return contentBlog;
    }

    public void setContentBlog(String contentBlog) {
        this.contentBlog = contentBlog;
    }
}
