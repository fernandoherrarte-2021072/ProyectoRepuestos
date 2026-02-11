package com.fernandoherrarte.RepuestosAutomotrices.service;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Empleado;

import java.util.List;

public interface ProveedorService {
    List<Proveedor> getAllProveedor();
    Proveedor getProveedorById(Integer id);
    Proveedor saveProveedor (Proveedor proveedor) throws RuntimeException;
    Proveedor uptadeProveedor(Integer id, Proveedor proveedor);
    void deleteProveedor(Integer id);
}
