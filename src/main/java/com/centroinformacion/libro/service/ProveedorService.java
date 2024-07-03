package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.Proveedor;

public interface ProveedorService {
	
	public abstract List<Proveedor> listaProveedor();
	public abstract Proveedor instertaProveedor(Proveedor obj);

}
