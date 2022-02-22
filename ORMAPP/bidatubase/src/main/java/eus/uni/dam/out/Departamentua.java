package eus.uni.dam.out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departamentua")
public class Departamentua {
	@Id
	private int id;
	@Column(name="Izena")
	private String izena;

	public Departamentua() {
		
	}
	
	public Departamentua(int id, String name) {
		this.id = id;
		this.izena = name;
	}

	public long getId() {
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
	
}
