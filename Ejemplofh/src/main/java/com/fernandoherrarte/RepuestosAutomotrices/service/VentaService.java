package com.fernandoherrarte.RepuestosAutomotrices.service;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> getAllVentas();
    Venta getVentaById(Integer id);
    Venta saveVenta(Venta venta) throws RuntimeException;
    Venta uptadeVenta(Integer id, Venta venta);
    void deleteVenta(Integer id);
}