package com.sripiranavan.spring.veterinary.basicrs.controller;

import com.sripiranavan.spring.veterinary.basicrs.Services.DogService;
import com.sripiranavan.spring.veterinary.basicrs.model.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/dogs")
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping(value = "/k9")
    public List<String> showNames(){
        return List.of("Puppy","Rosie","Tommy");
    }

    @GetMapping(value = "/all")
    public List<Dog> showDogs(){
        return dogService.getAllDogs();
    }
}
