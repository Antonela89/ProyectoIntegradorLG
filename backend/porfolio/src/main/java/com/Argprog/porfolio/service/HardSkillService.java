package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.HardSkill;
import com.Argprog.porfolio.repository.HardSkillRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HardSkillService implements IHardSkillService {
	
	@Autowired
	public HardSkillRepo hardSkillrepo;

	@Override
	public List<HardSkill> verHardSkill() {
		return hardSkillrepo.findAll();
	}

	@Override
	public void crearHSkills(HardSkill hardSkill) {
		hardSkillrepo.save(hardSkill);	
	}

	@Override
	public void eliminarHSkills(Long id) {
		hardSkillrepo.deleteById(id);	
	}

	@Override
	public HardSkill buscarHSkills(Long id) {
		return hardSkillrepo.findById(id).orElse(null);
	}
	
}
