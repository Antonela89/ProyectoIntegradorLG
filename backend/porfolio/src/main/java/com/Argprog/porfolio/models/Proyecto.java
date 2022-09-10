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
	private Long idPro;
	private String titulo;
	private String descripcion;
	private String url;
	private String imagen;

	//Contructores
	public Proyecto() {
	}

	public Proyecto(Long idPro, String titulo, String descripcion, String url, String imagen) {
		this.idPro = idPro;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.url = url;
		this.imagen = imagen;
	}

	// Getter and Setter 

	public Long getIdPro() {
		return idPro;
	}

	public void setIdPro(Long idPro) {
		this.idPro = idPro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
