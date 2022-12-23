package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("books",bookService.finAll());
        return "listbook";
    }
    @GetMapping("/createbook")
    public String showCreate(Model model){
        model.addAttribute("book",new Book());
        return "createbook";
    }
    @PostMapping("/createbook")
    public String Create(@ModelAttribute("book") Book book){
        bookService.save(book);
        return "redirect:/list";
    }
    @GetMapping("/{id}/delete")
    public String deleteBook(@PathVariable int id, Model model){
        model.addAttribute("book",bookService.finById(id));
        bookService.delete(id);
        return "redirect:/list";
    }
}
