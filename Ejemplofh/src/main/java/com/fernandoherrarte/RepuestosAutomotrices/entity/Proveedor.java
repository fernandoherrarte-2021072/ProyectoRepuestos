package com.fernandoherrarte.RepuestosAutomotrices.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(name = "nombre_proveedor", nullable = false, length = 60)
    private String nombreProveedor;

    @Column(name = "telefono_proveedor", nullable = false)
    private Integer telefonoProveedor;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "email_proveedor", nullable = false, length = 100)
    private String emailProveedor;


    public Proveedor() {
    }

    public Proveedor(Integer idProveedor, String nombreProveedor, Integer telefonoProveedor, String direccion, String emailProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.direccion = direccion;
        this.emailProveedor = emailProveedor;
    }


    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(Integer telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }

    // ===== equals & hashCode (opcional pero recomendado) =====
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proveedor)) return false;
        Proveedor that = (Proveedor) o;
        return Objects.equals(idProveedor, that.idProveedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedor);
    }
}