package com.pwn.student.controllers;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import com.pwn.student.service.MyAppStudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private MyAppStudentDetailsService masds;


    @Secured("ROLE_USER")
    @GetMapping("/dane")
    public String dane(Model model) {
        Student daneStudent = studentRepo.getByEmail(masds.userDetails.getUsername());
        model.addAttribute("daneStudenta", daneStudent);
        return "daneView";

    }
    @Secured("ROLE_USER")
    @GetMapping("/dane_zmiana")

    public String daneZmiana(Model model) {
        model.addAttribute("student", new Student());
        return "daneChangeView";

    }

    @Secured("ROLE_USER")
    @PostMapping("/dane_zmiana")
    public String daneZmiana(@ModelAttribute Student student, Model model) {
        Student daneStudentZmiana = studentRepo.getByEmail(masds.userDetails.getUsername());
        model.addAttribute("daneStudentaZmiana", daneStudentZmiana);
        studentRepo.save(daneStudentZmiana);
        return "daneChangeView";

    }





    @GetMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/contact")
    public String contact() {
        MailController mc = new MailController();
        mc.autoMail();
        return "contactFormView";
    }

    @GetMapping("/errorView")
    public String errorViewHandler() {
        return "errorView";
    }

}
