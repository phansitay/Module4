package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select s from blog as s where s.nameBlog like %:nameBlog%",nativeQuery = false)
    List<Blog> findAllByNameBlog(@Param("nameBlog") String nameBlog);
    List<Blog> findBlogByNameBlog(String nameBlog);
}
