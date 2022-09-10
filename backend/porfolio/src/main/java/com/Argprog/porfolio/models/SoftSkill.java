package com.Argprog.porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoftSkill implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSSkill;
	private String nombreSkill;
	private String fotoSkill;
	private int porcentaje;
	
	//Contructor

	public SoftSkill() {
	}

	public SoftSkill(Long idSSkill, String nombreSkill, String fotoSkill, int porcentaje) {
		this.idSSkill = idSSkill;
		this.nombreSkill = nombreSkill;
		this.fotoSkill = fotoSkill;
		this.porcentaje = porcentaje;
	}

	// Getter and Setter
	
	public Long getIdSSkill() {
		return idSSkill;
	}

	public void setIdSSkill(Long idSSkill) {
		this.idSSkill = idSSkill;
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
