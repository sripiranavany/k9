package com.sripiranavan.spring.veterinary.authorizationserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.Date;

@Controller
public class AuthController {

    @GetMapping(value = "/login")
    public String login(Model model) {
//        get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        model.addAttribute("currentYear", currentYear);
        return "login";
    }
}
