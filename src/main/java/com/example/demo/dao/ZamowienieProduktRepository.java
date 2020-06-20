package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.ZamowienieProdukt;

public interface ZamowienieProduktRepository  extends JpaRepository<ZamowienieProdukt, Integer> {
	
	@Query("select zp from ZamowienieProdukt zp where zp.id_produkt_zamowienie = ?1")
	ZamowienieProdukt findByProduktZamowienieId(int id);

}
