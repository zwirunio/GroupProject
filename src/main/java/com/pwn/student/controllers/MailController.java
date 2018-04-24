package com.pwn.student.controllers;

import com.pwn.student.models.ContactRequest;
import com.pwn.student.repositories.ContactRequestRepo;
import com.pwn.student.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailController {

    @Autowired
    private ContactRequestRepo contactRequestRepo;

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contactrequest", new ContactRequest());
        return "contactFormView";
    }
        @PostMapping("/contact")
        public String contact (@ModelAttribute ContactRequest contactRequest){
            // BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            // student.setPasswd(passwordEncoder.encode(student.getPasswd()));
            contactRequestRepo.save(contactRequest);
            MailService ms = new MailService();
            ms.autoMail();
            return "redirect:/";
        }
    }