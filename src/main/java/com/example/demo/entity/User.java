package com.example.demo.entity;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usertest")
public class User {
	@Id
	@NotNull(message="pole wymagane")
	@Column(unique = true)
	private String login;
	@NotNull(message="pole wymagane")
	private String password;
	
	private Date sqlDate = Date.valueOf(LocalDate.now());
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
