package com.Argprog.porfolio.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProy;
	private String nombreProyecto;
	private String descripcion;
	private String url;
	private String fotoProyecto;

	//Contructores
	public Proyecto() {
	}

	public Proyecto(Long idProy, String nombreProyecto, String descripcion, String url, String fotoProyecto) {
		this.idProy = idProy;
		this.nombreProyecto = nombreProyecto;
		this.descripcion = descripcion;
		this.url = url;
		this.fotoProyecto = fotoProyecto;
	}

	//Getters and Setters
	public Long getidProy() {
		return idProy;
	}

	public void setId(Long idProy) {
		this.idProy = idProy;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombre(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFotoProyecto() {
		return fotoProyecto;
	}

	public void setFotoProyecto(String fotoProyecto) {
		this.fotoProyecto = fotoProyecto;
	}
	
	

}
