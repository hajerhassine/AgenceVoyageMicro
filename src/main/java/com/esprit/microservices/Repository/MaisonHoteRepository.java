package com.esprit.microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservices.Entity.MaisonHote;

public interface MaisonHoteRepository extends JpaRepository<MaisonHote, Integer> {

}
