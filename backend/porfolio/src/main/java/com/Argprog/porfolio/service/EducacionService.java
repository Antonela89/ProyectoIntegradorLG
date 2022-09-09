package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Educacion;
import com.Argprog.porfolio.repository.EducacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class EducacionService implements IEducacionService {
	
	
	@Autowired
	public EducacionRepo educacionRepo;

	@Override
	public List<Educacion> verEducacion() {
		return educacionRepo.findAll();	
	}

	@Override
	public void crearEducacion(Educacion educacion) {
		educacionRepo.save(educacion);
	}

	@Override
	public void eliminarEducacion(Long id) {
		educacionRepo.deleteById(id);	
	}

	@Override
	public Educacion buscarEducacion(Long id) {
		return educacionRepo.findById(id).orElse(null);
		
	}
}
