package com.example.msdetalleventa.service;
import com.example.msdetalleventa.entity.DetalleVenta;

import java.util.List;
import java.util.Optional;
public interface DetalleVentaService {
    public List<DetalleVenta> listar();

    public DetalleVenta guardar(DetalleVenta detalleVenta);

    public DetalleVenta actualizar(DetalleVenta detalleVenta);

    public Optional<DetalleVenta> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
