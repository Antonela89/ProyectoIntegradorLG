
package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.SoftSkill;
import java.util.List;


public interface ISoftSkillService {
	public List <SoftSkill> verSSkill ();
	
	public void crearSSkills (SoftSkill softSkill);
	
	public void eliminarSSkills (Long id);
	
	public SoftSkill buscarSSkills (Long id);
	
}
