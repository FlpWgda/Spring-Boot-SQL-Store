package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="kategoria")
public class Kategoria {
		
	/**@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idKat")
	private int idKat;**/
	
	@Id
	@Column(name="nazwaKat")
	private String nazwaKat;
	
	@ManyToMany(mappedBy = "kategorie")
	private Set<Produkt> produkty;
	
	/**public int getIdKat() {
		return idKat;
	}

	public void setIdKat(int idKat) {
		this.idKat = idKat;
	}**/

	public String getNazwaKat() {
		return nazwaKat;
	}

	public void setNazwaKat(String nazwaKat) {
		this.nazwaKat = nazwaKat;
	}

	public Set<Produkt> getProdukty() {
		return produkty;
	}

	public void setProdukty(Set<Produkt> produkty) {
		this.produkty = produkty;
	}
	@Override
	public String toString() {
		return getNazwaKat();
	}
	

}
