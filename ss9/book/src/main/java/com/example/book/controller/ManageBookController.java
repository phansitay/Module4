package com.example.book.controller;

import com.example.book.model.ManageBook;
import com.example.book.repository.IManageBookRepository;
import com.example.book.service.IBookService;
import com.example.book.service.IManageBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManageBookController {
    @Autowired
    private IManageBookService manageBookService;
    @Autowired
    private IBookService bookService;
    @GetMapping("/listmanage")
    public String showList(Model model){
        model.addAttribute("manage",manageBookService.finAll());
        return "listmanage";
    }
    @GetMapping("/createmanage")
    public String showCreate(Model model){
        model.addAttribute("manage",new ManageBook());
//        bookService.creManage(id);
        return "createmanage";
    }
    @PostMapping("/createmanage")
    public String doCreate(@ModelAttribute("manage") ManageBook manageBook) {
        manageBookService.save(manageBook);

        return "createmanage";
    }
}
