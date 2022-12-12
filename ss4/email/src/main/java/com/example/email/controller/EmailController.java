package com.example.email.controller;

import com.example.email.model.Email;
import com.example.email.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @Autowired
    @Qualifier("emailService")
    private IEmailService emailService;
    @GetMapping("/list")
    public String finAll(Model model){
        model.addAttribute("emails",emailService.finAll());
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("email",new Email());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("email") Email email){
        emailService.save(email);
        return "create";
    }
}
