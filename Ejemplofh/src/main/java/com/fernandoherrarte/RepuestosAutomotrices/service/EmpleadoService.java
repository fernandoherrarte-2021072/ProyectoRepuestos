package com.fernandoherrarte.RepuestosAutomotrices.service;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Empleado;

import java.util.List;

public interface EmpleadoService {
    List<Empleado> getAllEmpleados();
    Empleado getEmpleadoById(Integer id);
    Empleado saveEmpleado (Empleado empleado) throws RuntimeException;
    Empleado uptadeEmpleado(Integer id, Empleado empleado);
    void deleteEmpleado(Integer id);
}
