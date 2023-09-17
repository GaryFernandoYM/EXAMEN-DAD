package com.example.msfacturacion.repository;

import com.example.msfacturacion.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends
        JpaRepository<Factura,Integer > {
}
