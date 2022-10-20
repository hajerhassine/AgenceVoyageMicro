package com.esprit.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OffreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OffreApplication.class, args);
	}

}
