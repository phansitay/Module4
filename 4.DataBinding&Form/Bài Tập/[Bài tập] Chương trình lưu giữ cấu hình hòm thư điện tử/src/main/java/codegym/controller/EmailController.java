package codegym.controller;

import codegym.model.Email;
import codegym.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
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

//    @GetMapping("/detail/{id}")
//    public String getDetail(@PathVariable("id")Integer codeStudent, Model model) {
//        System.out.println(codeStudent);
//        Student student = iStudentService.findById(codeStudent);
//        model.addAttribute("student", student);
//        return "detail";
//    }
//
//    @GetMapping("/detail")
//    public String getDetailWithRequestParam(@RequestParam("id")Integer codeStudent, Model model) {
//        System.out.println(codeStudent);
//        Student student = iStudentService.findById(codeStudent);
//        model.addAttribute("student", student);
//        return "detail";
//    }
//
//    @GetMapping("/create")
//    public String getPageCreate(Model model) {
//        model.addAttribute("student", new Student());
//        return "create";
//    }
//
//    @PostMapping("/create")
//    public String saveStudent(@ModelAttribute("student")Student temp,
//                              RedirectAttributes redirectAttributes) {
//        iStudentService.save(temp);
//        redirectAttributes.addFlashAttribute("msg"," Thêm mới thành công");
//        return "redirect:/list";
//    }
}
