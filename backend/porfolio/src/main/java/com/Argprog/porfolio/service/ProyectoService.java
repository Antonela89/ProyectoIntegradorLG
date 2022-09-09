package com.Argprog.porfolio.service;

import com.Argprog.porfolio.models.Proyecto;
import com.Argprog.porfolio.repository.ProyectoRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService {
	
	@Autowired
	public ProyectoRepo proyectoRepo;

	@Override
	public List<Proyecto> verProyecto() {
		return proyectoRepo.findAll();	
	}

	@Override
	public void crearProyecto(Proyecto proyecto) {
		proyectoRepo.save(proyecto);
	}

	@Override
	public void eliminarProyecto(Long id) {
		proyectoRepo.deleteById(id);	
	}

	@Override
	public Proyecto buscarProyecto(Long id) {
		return proyectoRepo.findById(id).orElse(null);
	}
}
