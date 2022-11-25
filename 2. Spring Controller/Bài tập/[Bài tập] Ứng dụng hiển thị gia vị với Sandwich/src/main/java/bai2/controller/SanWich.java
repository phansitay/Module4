package bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class SanWich {
    @GetMapping("/home")
    public String home(){
        return "sandWich";
    }
    @PostMapping("/save")
    public String save(Model model,@RequestParam("condiment") String[] condiment) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,condiment);
        model.addAttribute("kq",list);
        return "sandWich";
    }
}
