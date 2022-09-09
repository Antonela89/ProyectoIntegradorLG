package com.Argprog.porfolio.repository;

import com.Argprog.porfolio.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository <Educacion, Long> {
	
}
