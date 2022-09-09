package com.Argprog.porfolio.repository;

import com.Argprog.porfolio.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository <Experiencia, Long>{
	
}
