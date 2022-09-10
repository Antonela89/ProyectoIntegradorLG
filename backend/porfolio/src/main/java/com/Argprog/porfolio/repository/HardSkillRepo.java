package com.Argprog.porfolio.repository;

import com.Argprog.porfolio.models.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HardSkillRepo extends JpaRepository <HardSkill, Long> {
	
}
