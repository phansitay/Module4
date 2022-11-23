package bai1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TuDien {
    @GetMapping("/home")
    public String home(){
        return "tudien";
    }


    @PostMapping("/chuyen")
    public String chuyenTien(Model model,String tu)
    {
        String []tuDien ={"hello","list","student","teacher","goodbye","class","one","ten"};
        String []vietNam={"xin chao","danh sach","hoc sinh","giao vien","tam biet","lop","mot","muoi"};
        int vt=-1;
        String vietnam = "";
        for (int i=0;i< tuDien.length;i++){
            if (tuDien[i].equals(tu))
            {
                vt=i;
                break;
            }
        }
        if (vt==-1){
            vietnam="khong tim thay tu dien";
        }else {
            for (int i = 0; i < vietNam.length; i++) {
                if(i==vt){
                    vietnam=vietNam[i];
                    break;
                }
            }
        }
        model.addAttribute("tu",tu);
        model.addAttribute("kq",vietnam);
        return "tudien";

    }
}
