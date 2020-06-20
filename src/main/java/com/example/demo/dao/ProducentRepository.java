package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Producent;
import com.example.demo.entity.Uzytkownik;

public interface ProducentRepository extends JpaRepository<Producent, Integer>{

	Producent findByNazwaPr(String text);

}
