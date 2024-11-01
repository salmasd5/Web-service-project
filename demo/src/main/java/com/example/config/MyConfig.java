package com.example.config;

import com.example.api.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServelet= new ResourceConfig();
        jerseyServelet.register(CompteRestJaxRSAPI.class);
        return jerseyServelet;
    }

}
