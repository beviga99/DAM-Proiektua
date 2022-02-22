package eus.uni.dam.out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Erabiltzailea {

	@Id
	private int id;
	@Column
	private String izena;
	
	@ManyToOne
	@JoinColumn(name="id_dpto")
	private Departamentua departamentua;
	
	public Erabiltzailea() {
		
	}

	public Erabiltzailea(int id, String izena, Departamentua departamentua) {
		this.id = id;
		this.izena = izena;
		this.departamentua = departamentua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public Departamentua getDepartamentua() {
		return departamentua;
	}

	public void setDepartamentua(Departamentua departamentua) {
		this.departamentua = departamentua;
	}
	
}
