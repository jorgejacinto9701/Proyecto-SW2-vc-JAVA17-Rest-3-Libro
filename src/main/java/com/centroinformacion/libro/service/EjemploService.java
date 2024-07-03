package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.Ejemplo;

public interface EjemploService {

	public abstract Ejemplo insertaActualizaEjemplo(Ejemplo obj);
	public abstract List<Ejemplo> listaEjemplo();
}
