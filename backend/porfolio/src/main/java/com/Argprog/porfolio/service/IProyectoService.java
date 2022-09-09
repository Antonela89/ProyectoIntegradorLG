package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Proyecto;
import java.util.List;


public interface IProyectoService {
	
	public List <Proyecto> verProyecto ();
	
	public void crearProyecto (Proyecto proyecto);
	
	public void eliminarProyecto (Long id);
	
	public Proyecto buscarProyecto (Long id);	
}
