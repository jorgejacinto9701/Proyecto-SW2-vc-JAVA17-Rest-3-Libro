package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.Opcion;
import com.centroinformacion.libro.entity.Rol;
import com.centroinformacion.libro.entity.Usuario;

public interface UsuarioService {

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
}
