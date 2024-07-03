package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaTodos();
	public abstract Alumno insertaAlumno(Alumno obj);

}
