package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Experiencia;
import java.util.List;


public interface IExperienciaService {
	public List <Experiencia> verExperiencia ();
	
	public void crearExperiencia (Experiencia experiencia);
	
	public void eliminarExperiencia (Long id);
	
	public Experiencia buscarExperiencia (Long id);
}
