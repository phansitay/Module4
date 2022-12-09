package codegym.email.controller;

import codegym.email.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailController {
    @Autowired
    @Qualifier("emailService")
    private IEmailService emailService;
    @GetMapping("/list")
    public String listEmail(Model model){
        model.addAttribute("email",emailService.findAll());
        return "list";
    }

}
