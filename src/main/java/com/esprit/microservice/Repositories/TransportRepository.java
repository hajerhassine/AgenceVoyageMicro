package com.esprit.microservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.entities.Transport;





public interface TransportRepository extends JpaRepository<Transport,Integer>  {

}
