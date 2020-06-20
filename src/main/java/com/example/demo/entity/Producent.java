package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producent")
public class Producent {
	
	@OneToMany(mappedBy="producent")
	private Set<Produkt> produkt;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idPr")
	private int idPr;
	
	@Column(name="nazwaPr")
	private String nazwaPr;
	
	

	public int getIdPr() {
		return idPr;
	}



	public void setIdPr(int idPr) {
		this.idPr = idPr;
	}



	public String getNazwaPr() {
		return nazwaPr;
	}



	public void setNazwaPr(String nazwaPr) {
		this.nazwaPr = nazwaPr;
	}
	

	public Set<Produkt> getProdukt() {
		return produkt;
	}


	public void setProdukt(Set<Produkt> produkt) {
		this.produkt = produkt;
	}

	@Override
	public String toString() {
		return getNazwaPr();
	}
	
	
}
