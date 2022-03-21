package com.sripiranavan.spring.veterinary.basicrs.config;

import com.sripiranavan.spring.veterinary.basicrs.model.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class SpringRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
        config.useHalAsDefaultJsonMediaType(false);

        config.exposeIdsFor(Dog.class);
        config.exposeIdsFor(DogHandler.class);
        config.exposeIdsFor(DogsHandlersHistory.class);
        config.exposeIdsFor(HealthFollowUp.class);
        config.exposeIdsFor(Vaccine.class);
        config.exposeIdsFor(WoundTreatment.class);
    }
}
