package com.sripiranavan.spring.veterinary.authorizationserver.service;

import com.sripiranavan.spring.veterinary.authorizationserver.model.User;
import com.sripiranavan.spring.veterinary.authorizationserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsSecurityService implements UserDetailsService {
    @Autowired private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new UserDetailsSecurityServiceImpl(user);
    }
}
