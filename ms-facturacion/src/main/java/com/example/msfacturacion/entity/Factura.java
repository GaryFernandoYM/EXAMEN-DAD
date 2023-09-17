package com.example.msfacturacion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_venta;
    private String numero_factura;
    private Date fecha_emision;
    private Float subtotal;
    private Float impuestos;
    private Float descuentos;
    private Float total;
}
