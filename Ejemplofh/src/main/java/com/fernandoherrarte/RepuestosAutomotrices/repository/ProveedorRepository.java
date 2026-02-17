package com.fernandoherrarte.RepuestosAutomotrices.repository;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}