package com.example.baithi.controller;

import com.example.baithi.model.Contract;
import com.example.baithi.service.IContractService;
import com.example.baithi.service.ICustomerService;
import com.example.baithi.service.IService;
import com.example.baithi.validate.ContractValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IService service;

    @GetMapping("/list")
    public String showListContract(Model model){
        model.addAttribute("contracts", contractService.finAll());
        return "list";
    }

    @GetMapping("/listc")
    public String showListCustomer(Model model){
        model.addAttribute("customers", customerService.finAll());
        return "listc";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("contract", new Contract());
        model.addAttribute("customer",customerService.finAll());
        model.addAttribute("service",service.finAll());
        return "create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("contract") Contract contract, BindingResult bindingResult, Model model){
        ContractValidate  contractValidate = new ContractValidate();
        contractValidate.validate(contract,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customer",customerService.finAll());
            model.addAttribute("service",service.finAll());
            return "/create";
        }
        contractService.save(contract);
        return "redirect:/list";
    }

    @GetMapping("/{id}/detail")
    public String detail(@PathVariable int id, Model model){
        Contract contract = new Contract();
        contract=contractService.finById(id);
        model.addAttribute("contract", contract);
        return "detail";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete") int id, Model model){
        model.addAttribute("contract",contractService.finById(id));
        contractService.delete(id);
        return "redirect:/list";
    }

    @PostMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        model.addAttribute("customers",contractService.search(search));
        return "list";
    }

}
