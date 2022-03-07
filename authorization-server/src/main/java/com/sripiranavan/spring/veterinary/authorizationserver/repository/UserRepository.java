package com.sripiranavan.spring.veterinary.authorizationserver.repository;

import com.sripiranavan.spring.veterinary.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
    public User findByUserName(String username);
}
