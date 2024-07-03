package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.Libro;


public interface LibroService {
	
	public abstract List<Libro> listaLibro();
	public abstract Libro insertarLibro(Libro obj);

}
