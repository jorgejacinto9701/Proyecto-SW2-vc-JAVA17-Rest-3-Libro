package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.Sala;

public interface SalaService {
	public abstract Sala insertaActualizaSala(Sala obj);
	public abstract List<Sala> listaSala();
}
