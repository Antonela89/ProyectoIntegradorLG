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
	private Long idEdu;
	private String institucion;
	private String titulo;
	private int anoInicio;
	private int anoFin;
	
	//Contructores 
	public Educacion() {
	}

	public Educacion(Long idEdu, String institucion, String titulo, int anoInicio, int anoFin) {
		this.idEdu = idEdu;
		this.institucion = institucion;
		this.titulo = titulo;
		this.anoInicio = anoInicio;
		this.anoFin = anoFin;
	}

	//Getters and Setters
	public Long getIdEdu() {
		return idEdu;
	}

	public void setIdEdu(Long idEdu) {
		this.idEdu = idEdu;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFin() {
		return anoFin;
	}

	public void setAnoFin(int anoFin) {
		this.anoFin = anoFin;
	}
	
}
