package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Kategoria;
import com.example.demo.entity.Uzytkownik;

public interface KategoriaRepository extends JpaRepository<Kategoria, Integer> {

	List<Kategoria> findByNazwaKatIn(List<String> lista);
	Kategoria findByNazwaKat(String text);
	//List<Kategoria> findByIdKatGreaterThan(int i);

}
