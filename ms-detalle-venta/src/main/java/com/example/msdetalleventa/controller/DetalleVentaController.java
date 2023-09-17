package com.example.msdetalleventa.controller;
import com.example.msdetalleventa.entity.DetalleVenta;
import com.example.msdetalleventa.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleventa")

public class DetalleVentaController {
    @Autowired
    private DetalleVentaService detalleVentaService;
    @GetMapping()
    public ResponseEntity<List<DetalleVenta>> list() {
        return ResponseEntity.ok().body(detalleVentaService.listar());
    }
    @PostMapping()
    public ResponseEntity<DetalleVenta> save(@RequestBody DetalleVenta detalleVenta) {return ResponseEntity.ok(detalleVentaService.guardar(detalleVenta));
    }
    @PutMapping()
    public ResponseEntity<DetalleVenta> update(@RequestBody DetalleVenta detalleVenta) {return ResponseEntity.ok(detalleVentaService.actualizar(detalleVenta));
    }
    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> listById(@PathVariable(required = true) Integer id) {return ResponseEntity.ok().body(detalleVentaService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {detalleVentaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
