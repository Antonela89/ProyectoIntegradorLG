package com.Argprog.porfolio.service;


import com.Argprog.porfolio.models.SoftSkill;
import com.Argprog.porfolio.repository.SoftSkillRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SoftSkillService implements ISoftSkillService{
	
	@Autowired
	public SoftSkillRepo softSkillrepo;

	@Override
	public List<SoftSkill> verSSkill() {
		return softSkillrepo.findAll();
	}

	@Override
	public void crearSSkills(SoftSkill softSkill) {
		softSkillrepo.save(softSkill);
	}

	@Override
	public void eliminarSSkills(Long id) {
		softSkillrepo.deleteById(id);
	}

	@Override
	public SoftSkill buscarSSkills(Long id) {
		return softSkillrepo.findById(id).orElse(null);
	}

	
	
}
