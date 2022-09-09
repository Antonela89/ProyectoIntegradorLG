package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Experiencia;
import com.Argprog.porfolio.repository.ExperienciaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {
	
	@Autowired
	public ExperienciaRepo experienciaRepo;

	@Override
	public List<Experiencia> verExperiencia() {
		return experienciaRepo.findAll();	
	}

	@Override
	public void crearExperiencia(Experiencia experiencia) {
		experienciaRepo.save(experiencia);
	}

	@Override
	public void eliminarExperiencia(Long id) {
		experienciaRepo.deleteById(id);	
	}

	@Override
	public Experiencia buscarExperiencia(Long id) {
		return experienciaRepo.findById(id).orElse(null);
	}
}
