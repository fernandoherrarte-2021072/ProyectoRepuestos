package com.fernandoherrarte.RepuestosAutomotrices.controller;

import com.fernandoherrarte.RepuestosAutomotrices.entity.Repuesto;
import com.fernandoherrarte.RepuestosAutomotrices.service.RepuestoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repuestos")
public class RepuestoController {

    private final RepuestoService repuestoService;

    public RepuestoController(RepuestoService repuestoService) {
        this.repuestoService = repuestoService;
    }

    @GetMapping
    public List<Repuesto> getAllRepuestos() {
        return repuestoService.getAllRepuestos();
    }

    @PostMapping
    public ResponseEntity<Object> createRepuesto(@Valid @RequestBody Repuesto repuesto) {
        try {
            Repuesto createdRepuesto = repuestoService.saveRepuesto(repuesto);
            return new ResponseEntity<>(createdRepuesto, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateRepuesto(
            @PathVariable Integer id,
            @Valid @RequestBody Repuesto repuestoRequest) {
        try {
            Repuesto updated = repuestoService.uptadeRepuesto(id, repuestoRequest);
            return ResponseEntity.ok(updated);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRepuesto(@PathVariable Integer id) {
        repuestoService.deleteRepuesto(id);
        return ResponseEntity.noContent().build();
    }
}