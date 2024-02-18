package com.spring.rest.repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan("com.spring.rest.model")
@EnableJpaRepositories("com.spring.rest.repo")
public class SpringRestRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestRepositoryApplication.class, args);
    }

}
