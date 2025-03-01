package com.hermensote.spendobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpendoBackendApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpendoBackendApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpendoBackendApplication.class);
    }
}
