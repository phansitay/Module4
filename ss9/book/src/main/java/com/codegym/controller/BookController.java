package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.model.Manage;
import com.codegym.service.IBookService;
import com.codegym.service.IManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    @Qualifier("blogService")
    private IBookService bookService;

    @Autowired
    private IManageService manageService;

    @GetMapping("/list")
    public String showList(Model model)
    {
        model.addAttribute("books",bookService.getAll());
        return "list";
    }
    @GetMapping("/listManage")
    public String showListCategory(Model model)
    {
        model.addAttribute("manage",manageService.finAll());
        return "listManage";
    }
    @GetMapping("/{id}/detail")
    public String detail(@PathVariable int id, Model model){
        Book book = new Book();
        book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "detail";
    }
    @GetMapping("/{id}/create")
    public String showCreate(@PathVariable int id, Model model) {
        Manage manage = new Manage();
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("manage", manage);
        return "create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute Manage manage){
        manageService.save(manage);
//        bookService.updateNumber(manage.getBook().getQuantity());
        return "redirect:/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id ,Model model){
        model.addAttribute("Manage",manageService.findById(id));
        manageService.delete(id);
        bookService.updateNumbert(id);
        return "redirect:/list";
    }

}
