package com.example.formdangki.controller;

import com.example.formdangki.model.User;
import com.example.formdangki.service.IUserService;
import com.example.formdangki.validate.UserValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    @Qualifier("UserService")

    private IUserService userService;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("users",userService.finAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("user",new User());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("user") User user,BindingResult bindingResult,Model model){
        UserValidate userValidate = new UserValidate();
        userValidate.validate(user,bindingResult);
        if (bindingResult.hasErrors()){
            return "/create";
        }
        userService.insert(user);
        return "redirect:/list";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("user",userService.finById(id));
        userService.delete(id);
        return "redirect:/list";
    }

}
