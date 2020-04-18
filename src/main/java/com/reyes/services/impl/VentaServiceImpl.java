package com.reyes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyes.model.Venta;
import com.reyes.repo.IVentaRepo;
import com.reyes.services.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo repo;
	
	@Override
	public Venta registrar(Venta obj) {
		return repo.save(obj);
	}

	@Override
	public Venta actualizar(Venta obj) {
		return repo.save(obj);
	}

	@Override
	public List<Venta> listar() {
		return repo.findAll();
	}

	@Override
	public Venta listarPorId(Integer id) {
		return null;
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
