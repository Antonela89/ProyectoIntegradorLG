package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.Experiencia;
import com.Argprog.porfolio.service.IExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
	
	@Autowired
	private IExperienciaService experienciaService;		

	@GetMapping("/ver")
	@ResponseBody 
	public List<Experiencia> verExperiencia(){
		return experienciaService.verExperiencia();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/nuevo")
	public void agregarExperiencia(@RequestBody Experiencia experiencia){
		experienciaService.crearExperiencia(experiencia);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/borrar/{id}")
	public void eliminarExperiencia(@PathVariable Long id) {
		experienciaService.eliminarExperiencia(id);
	} 
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
	public Experiencia editarExperiencia(@PathVariable Long id,
                                @RequestParam("empresa") String nuevaEmpresa,
				@RequestParam("anoInicio") int nuevoAnoInicio,
				@RequestParam("anoFin") int nuevoAnoFin,
				@RequestParam("descripcion") String nuevaDescripcion){
        Experiencia experiencia = experienciaService.buscarExperiencia(id);
        
        experiencia.setEmpresa(nuevaEmpresa);
        experiencia.setAnoInicio(nuevoAnoInicio);
	experiencia.setAnoFin(nuevoAnoFin);
	experiencia.setDescripcion(nuevaDescripcion);
        
       experienciaService.crearExperiencia(experiencia);
        return experiencia;
    }	
	
}
