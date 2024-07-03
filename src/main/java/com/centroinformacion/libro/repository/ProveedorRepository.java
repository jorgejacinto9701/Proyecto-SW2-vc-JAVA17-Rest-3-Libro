package com.centroinformacion.libro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.libro.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

}
