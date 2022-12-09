package com.example.img.controller;

import com.example.img.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {
    @Autowired
    @Qualifier("ImageService")
    private IImageService imageService;
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("images",imageService.findAll());
        return "view";
    }
}
