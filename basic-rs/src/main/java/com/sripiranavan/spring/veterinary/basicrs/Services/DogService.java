package com.sripiranavan.spring.veterinary.basicrs.Services;

import com.sripiranavan.spring.veterinary.basicrs.model.Dog;
import com.sripiranavan.spring.veterinary.basicrs.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> getAllDogs(){
        return dogRepository.findAll();
    }
}
