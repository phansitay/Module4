package com.example.smartphone.controller;

import com.example.smartphone.model.SmartPhone;
import com.example.smartphone.service.ISmartPhoneService;
import com.sun.org.apache.bcel.internal.generic.IMPDEP1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService smartPhoneService;

    @PostMapping
    public ResponseEntity<SmartPhone> createSmartPhone(@RequestBody SmartPhone smartPhone)
    {
        return new ResponseEntity<>(smartPhoneService.save(smartPhone),HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ModelAndView getAllSmartPhonePage(){
        ModelAndView  modelAndView = new ModelAndView("/list");
        modelAndView.addObject("smartphones",smartPhoneService.findAll());
        return modelAndView;
    }

    @GetMapping
    public ResponseEntity<Iterable<SmartPhone>> allPhones() {
        return new ResponseEntity<>(smartPhoneService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<SmartPhone> deleteSmartphone(@PathVariable Long id) {
        Optional<SmartPhone> smartphoneOptional = smartPhoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartPhoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") Long id , Model model){
        model.addAttribute("b",smartPhoneService.findById(id));
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("smartPhone") SmartPhone smartPhone){
        smartPhoneService.save(smartPhone);
        return "redirect:/list";
    }

}
