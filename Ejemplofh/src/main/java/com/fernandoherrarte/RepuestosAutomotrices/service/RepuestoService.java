package com.fernandoherrarte.RepuestosAutomotrices.service;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Repuesto;

import java.util.List;

public interface RepuestoService {
    List<Repuesto> getAllRepuestos();
    Repuesto getRepuestoById(Integer id);
    Repuesto saveRepuesto(Repuesto repuesto) throws RuntimeException;
    Repuesto uptadeRepuesto(Integer id, Repuesto repuesto);
    void deleteRepuesto(Integer id);
}