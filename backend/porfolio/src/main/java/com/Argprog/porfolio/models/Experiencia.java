package com.Argprog.porfolio.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEx;
	private String compañia;
	private int inicio;
	private int fin;
	private String puestoLaboral;

	//Contructores
	public Experiencia() {
	}

	public Experiencia(Long idEx, String compañia, int inicio, int fin, String puestoLaboral) {
		this.idEx = idEx;
		this.compañia = compañia;
		this.inicio = inicio;
		this.fin = fin;
		this.puestoLaboral = puestoLaboral;
	}
	
	//Getter and Setter
	public Long getIdEx() {
		return idEx;
	}

	public void setIdEx(Long idEx) {
		this.idEx = idEx;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public String getPuestoLaboral() {
		return puestoLaboral;
	}

	public void setPuestoLaboral(String puestoLaboral) {
		this.puestoLaboral = puestoLaboral;
	}	
}
