package com.cl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConfigClientApplication.class);
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}
