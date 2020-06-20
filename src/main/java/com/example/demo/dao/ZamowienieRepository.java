package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Uzytkownik;
import com.example.demo.entity.Zamowienie;

public interface ZamowienieRepository extends JpaRepository<Zamowienie, Integer>{
	
	Zamowienie findByUzytkownikAndSealed(Uzytkownik uzytkownik, boolean sealed);
	List<Zamowienie> findByUzytkownik(Uzytkownik uzytkownik);
	Zamowienie findByIdZ(int id);

}
