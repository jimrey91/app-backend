package com.reyes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyes.model.DetalleVenta;
import com.reyes.repo.IDetalleVentaRepo;
import com.reyes.services.IDetalleVentaService;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaRepo repo;
	
	@Override
	public DetalleVenta registrar(DetalleVenta obj) {
		return repo.save(obj);
	}

	@Override
	public DetalleVenta actualizar(DetalleVenta obj) {
		return repo.save(obj);
	}

	@Override
	public List<DetalleVenta> listar() {
		return repo.findAll();
	}

	@Override
	public DetalleVenta listarPorId(Integer id) {
		return null;
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
