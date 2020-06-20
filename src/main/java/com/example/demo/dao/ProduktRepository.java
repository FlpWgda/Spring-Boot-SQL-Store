package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Produkt;
import com.example.demo.entity.Uzytkownik;

public interface ProduktRepository extends JpaRepository<Produkt, Integer>{
	
	public Produkt findByIdP(int id);
	public List<Produkt> findByAvailable(boolean available);

}
