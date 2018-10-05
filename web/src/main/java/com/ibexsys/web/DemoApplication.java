package com.ibexsys.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

// If needed, specifiy packages, newer versions of spring do not require it
//@EnableJpaRepositories(basePackages = {"com.ibexsys.persistence"})
//@EntityScan(basePackages = {"com.ibexsys.domain"})
//@ComponentScan(basePackages = {"com.ibexsys","com.ibexsys.persistence","com.ibexsys.domain", "com.ibexsys.web"})

@EnableJpaRepositories(basePackages = {"com.ibexsys"})
@EntityScan(basePackages = {"com.ibexsys"})
@ComponentScan(basePackages = {"com.ibexsys"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
