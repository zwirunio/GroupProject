package com.pwn.student.controllers;

import org.springframework.stereotype.Controller;
import com.pwn.student.models.ContactRequest;
import com.pwn.student.repositories.ContactRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactRequestRepo contactRequestRepo;

    @Secured("ROLE_USER")
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("contact", new ContactRequest());
        return "contactFormView";
    }

    @Secured("ROLE_USER")
    @PostMapping("/contact")
    public String contact(@ModelAttribute ContactRequest contactRequest) {
        contactRequestRepo.save(contactRequest);
        return "redirect:/";
    }
}
