package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.HardSkill;
import java.util.List;


public interface IHardSkillService {
	public List <HardSkill> verHardSkill ();
	
	public void crearHSkills (HardSkill hardSkill);
	
	public void eliminarHSkills (Long id);
	
	public HardSkill buscarHSkills (Long id);
	
}
