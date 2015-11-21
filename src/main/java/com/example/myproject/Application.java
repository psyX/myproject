package com.example.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
