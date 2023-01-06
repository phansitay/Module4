package com.codegym.service;

import com.codegym.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    void save(Blog blog);
    Blog getBlogById(int id);
    void delete(int id);
    List<Blog> search(String nameBlog);
}
