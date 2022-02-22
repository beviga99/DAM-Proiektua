package eus.uni.dam.out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Intzidentzia {

	@Id
	private int id;
	@Column(name="Komentarioa")
	private String contenido;
	
	@Column(name="Egoera")
	private int estado;

	@Column(name="p_id")
	private int pId;
	@Column(name="p_bidalitako_pertsona")
	private String persona;
	@Column(name="Tituloa")
	private String titulo;
	
	public Intzidentzia() {
		
	}
	
	public Intzidentzia(int id, String contenido, int estado, int pId, String persona, String titulo) {
		this.id = id;
		this.contenido = contenido;
		this.estado = estado;
		this.pId = pId;
		this.persona = persona;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
