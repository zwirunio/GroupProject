package com.pwn.student.controllers;

import com.pwn.student.models.Student;
import com.pwn.student.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private StudentRepo studentRepo;


    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("student", new Student());
        return "registerFormView";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Student student) {
     //   BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
     //   student.setPasswd(passwordEncoder.encode(student.getPasswd()));
        studentRepo.save(student);
        return "redirect:/";
    }


}
