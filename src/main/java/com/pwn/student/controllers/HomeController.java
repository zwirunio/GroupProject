package com.pwn.student.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
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
