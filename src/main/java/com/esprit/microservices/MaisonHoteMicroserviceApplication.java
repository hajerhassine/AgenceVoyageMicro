package com.esprit.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;



@SpringBootApplication
@EnableEurekaClient
public class MaisonHoteMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisonHoteMicroserviceApplication.class, args);
	}

}
