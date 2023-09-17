package com.example.msdetalleventa.service;
import com.example.msdetalleventa.entity.DetalleVenta;
import com.example.msdetalleventa.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class DetalleVentaServiceImpl implements DetalleVentaService{
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;


    @Override

    public List<DetalleVenta> listar() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta guardar(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public DetalleVenta actualizar(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public Optional<DetalleVenta> listarPorId(Integer id) {
        return detalleVentaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        detalleVentaRepository.deleteById(id);

    }
}
