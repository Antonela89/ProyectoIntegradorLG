package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.Proyecto;
import com.Argprog.porfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	
	@Autowired
	private IProyectoService proyectoService;
	
	@GetMapping("/ver")
	@ResponseBody 
	public List<Proyecto> verProyecto(){
		return proyectoService.verProyecto();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/nuevo")
	public void agregarProyecto(@RequestBody Proyecto proyecto){
		proyectoService.crearProyecto(proyecto);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/borrar/{id}")
	public void eliminarProyecto(@PathVariable Long id) {
		proyectoService.eliminarProyecto(id);
	} 
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
	public Proyecto editarProyecto(@PathVariable Long id,
                                @RequestParam("titulo") String nuevaNombreProyecto,
				@RequestParam("descripcion") String nuevaDescripcion,
				@RequestParam("url") String nuevaUrl,
				@RequestParam("imagen") String nuevaImagen){
        Proyecto proyecto = proyectoService.buscarProyecto(id);
        
	proyecto.setTitulo(nuevaNombreProyecto);
	proyecto.setDescripcion(nuevaDescripcion);
	proyecto.setUrl(nuevaUrl);
	proyecto.setImagen(nuevaImagen);
		
	proyectoService.crearProyecto(proyecto);
        return proyecto;
    }	
	
}
