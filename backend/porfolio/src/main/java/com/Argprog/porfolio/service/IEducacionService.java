package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Educacion;
import java.util.List;

public interface IEducacionService {
	
	public List <Educacion> verEducacion ();
	
	public void crearEducacion (Educacion educacion);
	
	public void eliminarEducacion (Long id);
	
	public Educacion buscarEducacion (Long id);
	
}
