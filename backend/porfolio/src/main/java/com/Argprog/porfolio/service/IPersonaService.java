
package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Persona;
import java.util.List;


public interface IPersonaService {
	
	public List<Persona> verPersonas();
	
	public void crearPersona(Persona persona);
	
	public void eliminarPersona(Long id);
	
	public Persona buscarPersona(Long id);
}
