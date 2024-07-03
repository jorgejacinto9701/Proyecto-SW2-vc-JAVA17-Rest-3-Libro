package com.centroinformacion.libro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.libro.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
	
	
	

}
