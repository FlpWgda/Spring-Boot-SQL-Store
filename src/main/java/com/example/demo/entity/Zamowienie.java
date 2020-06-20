package com.example.demo.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="zamowienie")
public class Zamowienie {
	
	@Id
	private int idZ;
	
	private boolean sealed;
	
	private Timestamp dataZ;
	
	@ManyToOne
	@JoinColumn(name="uzytkownik")
	private Uzytkownik uzytkownik;
	
	@OneToMany(mappedBy = "id_zamowienia",
            cascade = CascadeType.ALL)
	List<ZamowienieProdukt> zamowienieProdukt;

	public int getIdZ() {
		return idZ;
	}

	public void setIdZ(int idZ) {
		idZ = idZ;
	}

	public boolean isSealed() {
		return sealed;
	}

	public void setSealed(boolean sealed) {
		this.sealed = sealed;
	}

	public Timestamp getDataZ() {
		return dataZ;
	}

	public void setDataZ(Timestamp dataZ) {
		this.dataZ = dataZ;
	}

	public Uzytkownik getUzytkownik() {
		return uzytkownik;
	}

	public void setUzytkownik(Uzytkownik uzytkownik) {
		this.uzytkownik = uzytkownik;
	}

	public List<ZamowienieProdukt> getZamowienieProdukt() {
		return zamowienieProdukt;
	}

	public void setZamowienieProdukt(List<ZamowienieProdukt> zamowienieProdukt) {
		this.zamowienieProdukt = zamowienieProdukt;
	}
	
	/**@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name= "zamowienie_produkt",
			joinColumns = { @JoinColumn(name = "id_zamowienia")},
			inverseJoinColumns = { @JoinColumn(name = "id_produktu")}
		)
	List<Produkt> produkty;**/
	

}
