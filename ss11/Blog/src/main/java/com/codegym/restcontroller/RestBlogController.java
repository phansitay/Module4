package com.codegym.restcontroller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class RestBlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<List<Blog>> getListBlog() {
        return new ResponseEntity<>(blogService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/listcategory")
    public ResponseEntity<List<Category>> getListCategory() {
        return new ResponseEntity<>(categoryService.finAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getStudentById(@PathVariable("id") int id ) {
        Blog blog = blogService.getBlogById(id);
        if (blog == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
