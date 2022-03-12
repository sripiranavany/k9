package com.sripiranavan.spring.veterinary.basicrs.data;

import com.sripiranavan.spring.veterinary.basicrs.model.Dog;
import com.sripiranavan.spring.veterinary.basicrs.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class InitData {
    @Autowired private DogRepository dogRepository;

    @EventListener
    public void intData(ApplicationReadyEvent event) {
        if(dogRepository.count() == 0) {
            Dog dog1 = new Dog();
            dog1.setName("Buddy");
            dog1.setBreed("Labrador");
            dog1.setBirthDate(new Date());
            dog1.setColor("Black");
            dog1.setCost("1000");
            dog1.setPurchaseDate(new Date());
            dog1.setPurchaseFrom("Outsource");
            dog1.setGender("Male");
            dog1.setTypeOfPurchase("test");

            Dog dog2 = new Dog();
            dog2.setName("Puppy");
            dog2.setBreed("Labrador");
            dog2.setBirthDate(new Date());
            dog2.setColor("Black");
            dog2.setCost("2000");
            dog2.setPurchaseDate(new Date());
            dog2.setPurchaseFrom("Outsource");
            dog2.setGender("Male");
            dog2.setTypeOfPurchase("test");
            dogRepository.saveAllAndFlush(List.of(dog1,dog2));

        }
    }
}
