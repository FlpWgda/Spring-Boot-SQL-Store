package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="produkt")
public class Produkt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idP")
	private int idP;
	
	@NotNull(message="pole wymagane")
	@Column(name="nazwaP")
	private String nazwaP;

	@Min(value=0, message="liczba sztuk musi być większa lub równa 0")
	@Column(name="liczba_sztuk")
	private Integer liczbaSztuk;
	
	@NotNull(message="pole wymagane")
	@ManyToOne
	@JoinColumn(name="producent")
	private Producent producent;
	

	@ManyToMany
	@JoinTable(
			name= "produkt_kategoria",
			joinColumns = { @JoinColumn(name = "idProduktu")},
			inverseJoinColumns = { @JoinColumn(name = "idKategorii")}
		)
	List<Kategoria> kategorie;
		
	/**@ManyToMany(mappedBy = "produkty")
	private Set<Zamowienie> zamowienia;**/
	
	@OneToMany(mappedBy = "id_produktu",
            cascade = CascadeType.ALL)
	List<ZamowienieProdukt> zamowienieProdukt;
	
	@NotNull
	@DecimalMin(value = "0.0")
	@Column(name="cena", columnDefinition="Decimal(15,2) default '0.00'")
	private BigDecimal cena;
	
	private String opis;
	
	private boolean available;
	
	public void setProducent(Producent producent) {
		this.producent = producent;
	}

	public Producent getProducent() {
		return producent;
	}


	@Override
	public String toString() {
		return "Produkt [nazwa=" + nazwaP + ", liczbaSztuk=" + liczbaSztuk + ", producent=" + producent + "]";
	}

	

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public String getNazwaP() {
		return nazwaP;
	}

	public void setNazwaP(String nazwaP) {
		this.nazwaP = nazwaP;
	}

	public Integer getLiczbaSztuk() {
		return liczbaSztuk;
	}

	public void setLiczbaSztuk(Integer liczbaSztuk) {
		this.liczbaSztuk = liczbaSztuk;
	}
	
	public List<Kategoria> getKategorie() {
				
		return kategorie;
	}

	/**public String getKategorie() {
		String tmp = "";
		for(Kategoria k: kategorie){
			tmp += k.toString() + "\n";
		}
		return tmp;
	}**/

	public void setKategorie(List<Kategoria> kategorie) {
		this.kategorie = kategorie;
	}

	

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	


}
