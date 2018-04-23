package com.pwn.student.controllers;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import com.pwn.student.service.MyAppStudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    MyAppStudentDetailsService masds;

    @Secured("ROLE_USER")
    @GetMapping("/dane")
    public String dane(Model model) {
        Student daneStudent = studentRepo.getByEmail(masds.userDetails.getUsername());
        model.addAttribute("daneStudenta", daneStudent);
        return "daneView";

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
