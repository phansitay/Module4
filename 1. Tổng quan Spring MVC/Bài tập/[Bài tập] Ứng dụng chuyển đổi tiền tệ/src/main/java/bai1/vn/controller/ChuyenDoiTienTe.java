package bai1.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuyenDoiTienTe {
    @GetMapping("/home")
    public String home(){
        return "chuyenTien";
    }
    @PostMapping("/chuyen")
    public String chuyenTien(Model model,float soTien)
    {
        float kq = soTien*24000;
        model.addAttribute("usd",soTien);
        model.addAttribute("kq",kq);
        return "chuyenTien";

    }
}
