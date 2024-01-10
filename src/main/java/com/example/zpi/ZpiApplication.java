package com.example.zpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.zpi.entity"})  // scan JPA entities
public class ZpiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZpiApplication.class, args);
    }

}
