package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.IBlogService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    @Qualifier("blogService")
    private IBlogService blogService;

    @Autowired
    @Qualifier("categoryService")
    private ICategoryService categoryService;
    @GetMapping("/list")
    public String showList(Model model)
    {
        model.addAttribute("blogs",blogService.getAll());
        return "list";
    }
    @GetMapping("/listCategory")
    public String showListCategory(Model model)
    {
        model.addAttribute("category",categoryService.finAll());
        return "listCategory";
    }
    @GetMapping("/{id}/detail")
    public String detail(@PathVariable int id, Model model){
        Blog blog = new Blog();
        blog = blogService.getBlogById(id);
        model.addAttribute("blog", blog);
        return "detail";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id ,Model model){
        model.addAttribute("blog",blogService.getBlogById(id));
        blogService.delete(id);
        return "redirect:/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("category", categoryService.finAll());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }
    @GetMapping("/update")
    public String update(@RequestParam("id") int id , Model model){
        model.addAttribute("blog",blogService.getBlogById(id));
        model.addAttribute("category",categoryService.finAll());
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }
    @PostMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        model.addAttribute("blogs",blogService.search(search));
        return "list";
    }

}
