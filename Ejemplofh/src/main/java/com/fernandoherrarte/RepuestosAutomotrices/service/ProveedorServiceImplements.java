package com.fernandoherrarte.RepuestosAutomotrices.service;


import com.fernandoherrarte.RepuestosAutomotrices.entity.Empleado;
import com.fernandoherrarte.RepuestosAutomotrices.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImplements implements ProveedorService {
    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImplements(ProveedorRepository proveedorRepository){
        this.proveedorRepository = proveedorRepository;
    }
    @Override
    public List<Proveedor> getAllProveedor() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor getProveedorById(Integer id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedor saveProveedor(Proveedor proveedor) throws RuntimeException {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor uptadeProveedor(Integer id, Proveedor proveedor)
    { Proveedor proveedorExistente =proveedorRepository.findById(id).orElse(null);
        if (proveedorExistente != null){
            proveedor.setIdProveedor(id);
            return proveedorRepository.save(proveedor);
        }

        return null;
    }

    @Override
    public void deleteProveedor(Integer id) {
        proveedorRepository.deleteById(id);
    }


}
