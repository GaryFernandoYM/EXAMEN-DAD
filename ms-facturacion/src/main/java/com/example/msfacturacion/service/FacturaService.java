package com.example.msfacturacion.service;
import com.example.msfacturacion.entity.Factura;

import java.util.List;
import java.util.Optional;

public interface FacturaService {
    public List<Factura> listar();

    public Factura guardar(Factura factura);

    public Factura actualizar(Factura factura);

    public Optional<Factura> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
