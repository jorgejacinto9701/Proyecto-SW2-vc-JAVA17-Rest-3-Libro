package com.centroinformacion.libro.service;

import java.util.List;

import com.centroinformacion.libro.entity.DataCatalogo;

public interface DataCatalogoService {

	public abstract List<DataCatalogo> listaDataCatalogo(int idTipo);
	

}
