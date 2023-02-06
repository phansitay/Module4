package com.example.ontap.controller;

import com.example.ontap.Validate.BookValidate;
import com.example.ontap.model.Book;
import com.example.ontap.service.IBookService;
import com.example.ontap.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("books", bookService.finAll());
        return "list";
    }
    @GetMapping("/category")
    public String showListCategory(Model model){
        model.addAttribute("category",categoryService.finAll());
        return "category";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("book",new Book());
        model.addAttribute("category",categoryService.finAll());
        return "create";
    }
    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult,Model model){
        BookValidate bookValidate = new BookValidate();
        bookValidate.validate(book,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("category",categoryService.finAll());
            return "/create";
        }
        bookService.save(book);
        return "result";
    }

    @GetMapping("/{id}/detail")
    public String detail(@PathVariable int id,Model model){
        Book book = new Book();
        book=bookService.finById(id);
        model.addAttribute("book", book);
        return "detail";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete") int id, Model model){
        model.addAttribute("book",bookService.finById(id));
        bookService.delete(id);
        return "redirect:/list";
    }

    @PostMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        model.addAttribute("books",bookService.search(search));
        return "list";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id ,Model model){
        model.addAttribute("book",bookService.finById(id));
        model.addAttribute("category",categoryService.finAll());
        return "update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("book") Book book){
        bookService.save(book);
        return "redirect:/list";
    }

}
