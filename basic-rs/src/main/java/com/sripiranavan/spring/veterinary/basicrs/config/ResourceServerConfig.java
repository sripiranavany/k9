package com.sripiranavan.spring.veterinary.basicrs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class ResourceServerConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.mvcMatcher("/k9/**")
                .authorizeRequests().mvcMatchers("/k9/**")
                .access("hasAuthority('SCOPE_k9.read')")
                .and()
                .oauth2ResourceServer()
                .jwt();

        return http.build();
    }
}
