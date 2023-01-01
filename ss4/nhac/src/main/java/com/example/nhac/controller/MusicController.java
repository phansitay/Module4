package com.example.nhac.controller;

import com.example.nhac.model.Music;
import com.example.nhac.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MusicController {
    @Autowired
    private IMusicService musicService;

    @GetMapping("/list")
    private String showList(Model model){
        model.addAttribute("music",musicService.finAll());
        return "list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("music",new Music());
        return "create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("music") Music music){
        musicService.save(music);
        return "redirect:/list";
    }

}
