package codegym.controller;

import codegym.model.Email;
import codegym.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmailController {

    @Autowired
    EmailService emailService;
    @GetMapping("/list")
    public String getListEmail(Model model) {
        List<Email> emailList = emailService.getAll();
        model.addAttribute("emailList", emailList);
        return "list";
    }

    @GetMapping("/create")
    public String getPageCreate(Model model) {
        model.addAttribute("email", new Email());
        return "create";
    }

    @PostMapping("/create")
    public String saveStudent(@ModelAttribute("email")Email temp, RedirectAttributes redirectAttributes) {
        emailService.save(temp);
        redirectAttributes.addFlashAttribute("msg"," Thêm mới thành công");
        return "redirect:/list";
    }
}
