package com.fernandoherrarte.RepuestosAutomotrices.service;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Proveedor;

import java.util.List;

public interface ProveedorService {
    List<Proveedor> getAllProveedores();
    Proveedor getProveedorById(Integer id);
    Proveedor saveProveedor(Proveedor proveedor) throws RuntimeException;
    Proveedor updateProveedor(Integer id, Proveedor proveedor);
    void deleteProveedor(Integer id);
}