package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.Skills;
import com.Argprog.porfolio.service.ISkillsService;
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
@RequestMapping("/skills")
public class SkillsController {
	
	@Autowired
	private ISkillsService skillsService;
	
	@GetMapping("/ver")
	@ResponseBody 
	public List<Skills> verSkills(){
		return skillsService.verSkills();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/nuevo")
	public void agregarSkills(@RequestBody Skills skills){
		skillsService.crearSkills(skills);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/borrar/{id}")
	public void eliminarSkills(@PathVariable Long id) {
		skillsService.eliminarSkills(id);
	} 
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
    public Skills editarSkills(@PathVariable Long id,
                                @RequestParam("nombreSkill") String nuevoNombre,
				@RequestParam("fotoSkill") String nuevaFoto,
				@RequestParam("porcentaje") int nuevoPorcentaje){
        Skills skills = skillsService.buscarSkills(id);
        
        skills.setNombreSkill(nuevoNombre);
        skills.setFotoSkill(nuevaFoto);
        skills.setPorcentaje(nuevoPorcentaje);
        
       skillsService.crearSkills(skills);
        return skills;
    }
}
