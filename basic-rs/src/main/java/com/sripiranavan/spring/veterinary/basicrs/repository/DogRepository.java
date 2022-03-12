package com.sripiranavan.spring.veterinary.basicrs.repository;

import com.sripiranavan.spring.veterinary.basicrs.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
