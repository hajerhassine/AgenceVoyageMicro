package com.esprit.microservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.esprit.microservice.Entity.Offre;
import com.esprit.microservice.Repository.OffreRepository;


@EnableEurekaClient
@SpringBootApplication
public class OffreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OffreApplication.class, args);
	}

	
	@Bean
	 ApplicationRunner init(OffreRepository repository){
		return args ->{
			Stream.of("Offre1","Offre2","Offre3").forEach(nom ->{
				repository.save(new Offre(nom));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
