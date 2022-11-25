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
        return "maytinh";
    }
    @PostMapping("/chuyen")
    public String chuyenTien(Model model,float soTien)
    {
        float kq = soTien*24000;
        model.addAttribute("usd",soTien);
        model.addAttribute("kq",kq);
        return "maytinh";
    }
    @PostMapping("/save")
    public String mayTinh(Model model,@RequestParam("toan") String toan,@RequestParam("a") float a,@RequestParam("b") float b)
    {
        float s=0;
        switch (toan){
            case "+":
                s=a+b;
                break;
            case "-":
                s=a-b;
                break;
            case "*":
                s=a*b;
                break;
            case "/":
                s=a/b;
                break;
        }
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("kq",s);
        return "maytinh";
    }
}
