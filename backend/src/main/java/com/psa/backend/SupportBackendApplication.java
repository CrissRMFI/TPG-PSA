package com.psa.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.psa.backend.model")
@EnableJpaRepositories("com.psa.backend.dao")
public class SupportBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SupportBackendApplication.class, args);
    }
}
