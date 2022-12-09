package com.example.img.controller;

import com.example.img.model.Image;
import com.example.img.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageController {
    @Autowired
    @Qualifier("ImageService")
    private IImageService imageService;

    @ModelAttribute
    public String getAllImages(Model model) {
        model.addAttribute("images", imageService.findAll());
        return "list";
    }

    @GetMapping("/list")
    public String list(Model model){
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("image",new Image());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("image") Image image){
        imageService.save(image);
        imageService.findAll();
        return "/create";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id,  Model model){
        model.addAttribute("image",imageService.findById(id));
        imageService.delete(id);
        return "redirect:/list";
    }
    int s=0;
    @GetMapping("/like")
    public String like(Model model){
        s=s+1;
        System.out.println("like "+s);
        model.addAttribute("s",s);
        return "redirect:/create";
    }
}
