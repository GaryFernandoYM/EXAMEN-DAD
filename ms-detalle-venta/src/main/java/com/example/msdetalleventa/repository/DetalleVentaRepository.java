package com.example.msdetalleventa.repository;

import com.example.msdetalleventa.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaRepository extends
        JpaRepository<DetalleVenta,Integer > {
}
