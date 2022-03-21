package com.sripiranavan.spring.veterinary.basicrs.repository;

import com.sripiranavan.spring.veterinary.basicrs.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dogs",path = "dogs")
public interface DogRepository extends JpaRepository<Dog, Long> {
}
