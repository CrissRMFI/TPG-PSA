package com.psa.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan("com.psa.backend.model")
@EnableJpaRepositories("com.psa.backend.dao")
public class SupportBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupportBackendApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/ticket").allowedOrigins("https://localhost:8443");
				registry.addMapping("/external/clients").allowedOrigins("https://localhost:8443");
				registry.addMapping("/external/resources").allowedOrigins("https://localhost:8443");
			}
		};
	}

}
