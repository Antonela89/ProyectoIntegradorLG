package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.Educacion;
import com.Argprog.porfolio.service.IEducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
	
	@Autowired
	private IEducacionService educacionService;
	
	@GetMapping("/ver")
	@ResponseBody 
	public List<Educacion> verEducacion(){
		return educacionService.verEducacion();
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/nuevo")
	public void agregarEducacion(@RequestBody Educacion educacion){
		educacionService.crearEducacion(educacion);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/borrar/{id}")
	public void eliminarUsuario(@PathVariable Long id) {
		educacionService.eliminarEducacion(id);	
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
	public Educacion editarEducacion(@PathVariable Long id,
                                @RequestParam("institucion") String nuevaInstitucion,
				@RequestParam("titulo") String nuevoTitulo,
				@RequestParam("anoInicio") int nuevoAnoInicio,
				@RequestParam("anoFin") int nuevoAnoFin){
        Educacion educacion = educacionService.buscarEducacion(id);
        
        educacion.setInstitucion(nuevaInstitucion);
        educacion.setTitulo(nuevoTitulo);
        educacion.setAnoInicio(nuevoAnoInicio);
	educacion.setAnoFin(nuevoAnoFin);
        
       educacionService.crearEducacion(educacion);
        return educacion;
    }	
}
