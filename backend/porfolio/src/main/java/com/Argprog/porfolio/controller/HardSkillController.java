package com.Argprog.porfolio.controller;

import com.Argprog.porfolio.models.HardSkill;
import com.Argprog.porfolio.service.IHardSkillService;
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
@RequestMapping("/hardskill")
public class HardSkillController {
	@Autowired
	private IHardSkillService hardSkillService;
	
	@GetMapping("/ver")
	@ResponseBody 
	public List<HardSkill> verSkills(){
		return hardSkillService.verHardSkill();
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/nuevo")
	public void agregarSkills(@RequestBody HardSkill hardSkill){
		hardSkillService.crearHSkills(hardSkill);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/borrar/{id}")
	public void eliminarSkills(@PathVariable Long id) {
		hardSkillService.eliminarHSkills(id);
	} 
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/editar/{id}")
    public HardSkill editarSkills(@PathVariable Long id,
                                @RequestParam("nombreSkill") String nuevoNombre,
				@RequestParam("fotoSkill") String nuevaFoto,
				@RequestParam("porcentaje") int nuevoPorcentaje){
        HardSkill hardSkill = hardSkillService.buscarHSkills(id);
        
        hardSkill.setNombreSkill(nuevoNombre);
        hardSkill.setFotoSkill(nuevaFoto);
        hardSkill.setPorcentaje(nuevoPorcentaje);
        
       hardSkillService.crearHSkills(hardSkill);
        return hardSkill;
	}
}
