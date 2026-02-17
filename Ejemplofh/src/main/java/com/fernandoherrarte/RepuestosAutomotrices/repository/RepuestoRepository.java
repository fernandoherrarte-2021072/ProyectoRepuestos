package com.fernandoherrarte.RepuestosAutomotrices.repository;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Repuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepuestoRepository extends JpaRepository<Repuesto, Integer> {
}