package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "zamowienie_produkt")
public class ZamowienieProdukt implements Serializable {
	
	@Id
	private int id_produkt_zamowienie;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_zamowienia") 
	private Zamowienie id_zamowienia;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_produktu") 
	private Produkt id_produktu;
	
	private int ilosc;
	
	public Zamowienie getId_zamowienia() {
		return id_zamowienia;
	}
	public void setId_zamowienia(Zamowienie id_zamowienia) {
		this.id_zamowienia = id_zamowienia;
	}
	public Produkt getId_produktu() {
		return id_produktu;
	}
	public void setId_produktu(Produkt id_produktu) {
		this.id_produktu = id_produktu;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public int getId_produkt_zamowienie() {
		return id_produkt_zamowienie;
	}
	public void setId_produkt_zamowienie(int id_produkt_zamowienie) {
		this.id_produkt_zamowienie = id_produkt_zamowienie;
	}
	
}
