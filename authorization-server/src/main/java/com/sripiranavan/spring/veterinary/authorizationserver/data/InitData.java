package com.sripiranavan.spring.veterinary.authorizationserver.data;

import com.sripiranavan.spring.veterinary.authorizationserver.model.Role;
import com.sripiranavan.spring.veterinary.authorizationserver.model.User;
import com.sripiranavan.spring.veterinary.authorizationserver.repository.RoleRepository;
import com.sripiranavan.spring.veterinary.authorizationserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class InitData {
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @EventListener
    public void InitData(ApplicationReadyEvent event){
        if(roleRepository.count() == 0){
            Role userRole = new Role();
            userRole.setName("ROLE_USER");

            Role adminRole = new Role();
            adminRole.setName("ROLE_ADMIN");

            roleRepository.saveAll(List.of(userRole,adminRole));

            User normalUser = new User();
            normalUser.setUserName("sripiranavan");
            normalUser.setEmail("sripiranavan08@gmail.com");
            normalUser.setPassword(passwordEncoder.encode("secret"));
            Set<Role> normalRoles = new HashSet<>();
            normalRoles.add(userRole);
            normalUser.setRoles(normalRoles);

            User adminUser = new User();
            adminUser.setUserName("biranavan");
            adminUser.setEmail("biranavan8@gmail.com");
            adminUser.setPassword(passwordEncoder.encode("secret"));
            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(adminRole);
            adminUser.setRoles(adminRoles);

            userRepository.saveAll(List.of(normalUser,adminUser));
        }
    }
}
