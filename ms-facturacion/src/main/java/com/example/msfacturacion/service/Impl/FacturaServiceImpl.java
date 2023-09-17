package com.example.msfacturacion.service.Impl;
import com.example.msfacturacion.entity.Factura;
import com.example.msfacturacion.repository.FacturaRepository;
import com.example.msfacturacion.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FacturaServiceImpl implements FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;


    @Override

    public List<Factura> listar() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura guardar(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura actualizar(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Optional<Factura> listarPorId(Integer id) {
        return facturaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        facturaRepository.deleteById(id);

    }
}
