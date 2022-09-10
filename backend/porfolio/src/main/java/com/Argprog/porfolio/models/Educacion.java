package com.Argprog.porfolio.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEd;
	private String instituto;
	private String diploma;
	private int inicio;
	private int fin;
	
	//Contructores 
	public Educacion() {
	}

	public Educacion(Long idEd, String instituto, String diploma, int inicio, int fin) {
		this.idEd = idEd;
		this.instituto = instituto;
		this.diploma = diploma;
		this.inicio = inicio;
		this.fin = fin;
	}

	//Getter and Setter

	public Long getIdEd() {
		return idEd;
	}

	public void setIdEd(Long idEd) {
		this.idEd = idEd;
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
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
		
}
