package com.Argprog.porfolio.models;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Persona implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nombre;
	private String apellido;
	private String titulo;
	private String acercaDeMi;
	private String foto;
	private String banner;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEd")
	private List<Educacion> educacionList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idEx")
	private List<Experiencia> experienciaList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
	private List<Proyecto> proyectoList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idSSkill")
	private List<SoftSkill> softSkillList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idHSkill")
	private List<HardSkill> hardSkillList;

 
	//Constructores 

	public Persona() {
	}

	public Persona(Long id, String nombre, String apellido, String titulo, String acercaDeMi, String foto, String banner) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.acercaDeMi = acercaDeMi;
		this.foto = foto;
		this.banner = banner;
	}

	
	//Getter and Setter
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAcercaDeMi() {
		return acercaDeMi;
	}

	public void setAcercaDeMi(String acercaDeMi) {
		this.acercaDeMi = acercaDeMi;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}
}