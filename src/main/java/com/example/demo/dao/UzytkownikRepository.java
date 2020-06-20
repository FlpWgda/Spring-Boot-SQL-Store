package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Uzytkownik;

public interface UzytkownikRepository extends JpaRepository<Uzytkownik, String>{
	
	Uzytkownik findByLogin(String login);

}
