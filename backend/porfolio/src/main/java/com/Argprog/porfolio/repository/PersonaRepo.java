package com.Argprog.porfolio.repository;


import com.Argprog.porfolio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository <Persona, Long> {
	
}
