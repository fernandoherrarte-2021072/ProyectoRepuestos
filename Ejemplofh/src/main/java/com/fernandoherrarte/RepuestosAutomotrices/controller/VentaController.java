package com.fernandoherrarte.RepuestosAutomotrices.controller;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Venta;
import com.fernandoherrarte.RepuestosAutomotrices.service.VentaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    
    @GetMapping
    public List<Venta> getAllVentas() {
        return ventaService.getAllVentas();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getVentaById(@PathVariable Integer id) {
        Venta venta = ventaService.getVentaById(id);
        if (venta == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Venta no encontrada con id: " + id);
        }
        return ResponseEntity.ok(venta);
    }


    @PostMapping
    public ResponseEntity<Object> createVenta(@Valid @RequestBody Venta venta) {
        try {
            Venta created = ventaService.saveVenta(venta);
            return new ResponseEntity<>(created, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Object> updateVenta(
            @PathVariable Integer id,
            @Valid @RequestBody Venta ventaRequest) {
        try {
            Venta updated = ventaService.uptadeVenta(id, ventaRequest);
            if (updated == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Venta no encontrada con id: " + id);
            }
            return ResponseEntity.ok(updated);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Integer id) {
        ventaService.deleteVenta(id);
        return ResponseEntity.noContent().build();
    }
}