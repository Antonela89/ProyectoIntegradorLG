package com.Argprog.porfolio.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSkill;
	private String nombreSkill;
	private String fotoSkill;
	private int porcentaje;

	//Contructores
	public Skills() {
	}

	public Skills(Long idSkill, String nombreSkill, String fotoSkill, int porcentaje) {
		this.idSkill = idSkill;
		this.nombreSkill = nombreSkill;
		this.fotoSkill = fotoSkill;
		this.porcentaje = porcentaje;
	}

	//Getters and Setters
	public Long getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(Long idSkill) {
		this.idSkill = idSkill;
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
