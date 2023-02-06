package com.example.furama.controller;

import com.example.furama.model.Customer;
import com.example.furama.service.ICustomerService;
import com.example.furama.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("customers", customerService.finAll());
        return "listcustomer";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType",customerTypeService.finAll());
        return "create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute Customer customer){
        customerService.save(customer);
        return "redirect:/list";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete") int id, Model model){
        model.addAttribute("book",customerService.finById(id));
        customerService.delete(id);
        return "redirect:/list";
    }
    @PostMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        model.addAttribute("customers",customerService.search(search));
        return "listcustomer";
    }
}
