package eus.uni.dam.out;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Egoera {
	@Id
	private int id;
	
	@Column
	private String izena;

	public Egoera() {
		
	}
	
	public Egoera(int id, String izena) {
		this.id = id;
		this.izena = izena;
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
	
	
}
