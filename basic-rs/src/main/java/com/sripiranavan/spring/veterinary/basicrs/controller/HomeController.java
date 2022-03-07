package com.sripiranavan.spring.veterinary.basicrs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping(value = "/k9")
    public List<String> showNames(){
        return List.of("Puppy","Rosie","Tommy");
    }
}
