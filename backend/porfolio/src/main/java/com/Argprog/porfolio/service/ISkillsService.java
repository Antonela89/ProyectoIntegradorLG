package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Skills;
import java.util.List;


public interface ISkillsService {
	public List <Skills> verSkills ();
	
	public void crearSkills (Skills skills);
	
	public void eliminarSkills (Long id);
	
	public Skills buscarSkills (Long id);	
	
}
