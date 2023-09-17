package com.example.msdetalleventa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_venta;
    private Integer id_producto;
    private Integer cantidad;
    private Float precio_unitario;
}
