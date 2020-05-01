package com.reyes.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyes.model.Producto;
import com.reyes.repo.IProductoRepo;
import com.reyes.services.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo repo;
	
	@Override
	public Producto registrar(Producto obj) {
		return repo.save(obj);
	}

	@Override
	public Producto actualizar(Producto obj) {
		return repo.save(obj);
	}

	@Override
	public List<Producto> listar() {
		return repo.findAll();
	}

	@Override
	public Producto listarPorId(Integer id) {
		Optional<Producto> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Producto();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
