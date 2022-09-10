package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.SoftSkill;
import com.Argprog.porfolio.service.ISoftSkillService;
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
@RequestMapping("/softskill")
public class SoftSkillController {
	@Autowired
	private ISoftSkillService softSkillService;
	
	@GetMapping("/ver")
	@ResponseBody 
	public List<SoftSkill> verSkills(){
		return softSkillService.verSSkill();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/nuevo")
	public void agregarSkills(@RequestBody SoftSkill softSkill){
		softSkillService.crearSSkills(softSkill);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/borrar/{id}")
	public void eliminarSkills(@PathVariable Long id) {
		softSkillService.eliminarSSkills(id);
	} 
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
    public SoftSkill editarSkills(@PathVariable Long id,
                                @RequestParam("nombreSkill") String nuevoNombre,
				@RequestParam("fotoSkill") String nuevaFoto,
				@RequestParam("porcentaje") int nuevoPorcentaje){
        SoftSkill softSkill = softSkillService.buscarSSkills(id);
        
        softSkill.setNombreSkill(nuevoNombre);
        softSkill.setFotoSkill(nuevaFoto);
        softSkill.setPorcentaje(nuevoPorcentaje);
        
       softSkillService.crearSSkills(softSkill);
        return softSkill;
	}
}