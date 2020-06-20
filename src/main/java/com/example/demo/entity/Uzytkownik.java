package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="uzytkownik")
public class Uzytkownik {

	@Id
	@NotNull(message="pole wymagane")
	@Column(unique = true)
	private String login;
	
	@NotNull(message="pole wymagane")
	@Column(name="haslo")
	private String haslo;
	
	@Column(name="rola")
	@Enumerated(EnumType.STRING)
	private Rola rola;
	
	@OneToMany(mappedBy="uzytkownik")
	private Set<Zamowienie> zamowienia;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public Rola getRola() {
		return rola;
	}

	public void setRola(Rola rola) {
		this.rola = rola;
	}

	public Set<Zamowienie> getZamowienia() {
		return zamowienia;
	}

	public void setZamowienia(Set<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}
	

	
	

}
