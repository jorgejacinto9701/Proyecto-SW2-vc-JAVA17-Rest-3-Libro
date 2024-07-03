package com.centroinformacion.libro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.libro.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor,Integer> {

}
