package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Argprog.porfolio.repository.PersonaRepo;
import javax.transaction.Transactional;


@Service
@Transactional
public class PersonaService implements IPersonaService{
	
	@Autowired
	public PersonaRepo personaRepo;

	@Override
	public List<Persona> verPersonas() {
		return personaRepo.findAll();
	}

	@Override
	public void crearPersona(Persona persona) {
		personaRepo.save(persona);
	}

	@Override
	public void eliminarPersona(Long id) {
		personaRepo.deleteById(id);
	}

	@Override
	public Persona buscarPersona(Long id) {
		Persona persona = personaRepo.findById(id).orElse(null);
		return persona;
	}

	
	
}
