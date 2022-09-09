package com.Argprog.porfolio.repository;


import com.Argprog.porfolio.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository <Proyecto, Long> {
	
}
