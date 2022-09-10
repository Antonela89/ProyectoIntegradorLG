package com.Argprog.porfolio.repository;


import com.Argprog.porfolio.models.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SoftSkillRepo extends JpaRepository <SoftSkill, Long> {
	
}
