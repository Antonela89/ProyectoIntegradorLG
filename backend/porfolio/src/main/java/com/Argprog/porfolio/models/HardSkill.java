package com.Argprog.porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HardSkill implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHSkill;
	private String nombreSkill;
	private String fotoSkill;
	private int porcentaje;
	
	//Contructor
	public HardSkill() {
	}

	public HardSkill(Long idHSkill, String nombreSkill, String fotoSkill, int porcentaje) {
		this.idHSkill = idHSkill;
		this.nombreSkill = nombreSkill;
		this.fotoSkill = fotoSkill;
		this.porcentaje = porcentaje;
	}
	
	//Getter and Setter

	public Long getIdHSkill() {
		return idHSkill;
	}

	public void setIdHSkill(Long idHSkill) {
		this.idHSkill = idHSkill;
	}

	public String getNombreSkill() {
		return nombreSkill;
	}

	public void setNombreSkill(String nombreSkill) {
		this.nombreSkill = nombreSkill;
	}

	public String getFotoSkill() {
		return fotoSkill;
	}

	public void setFotoSkill(String fotoSkill) {
		this.fotoSkill = fotoSkill;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
}
