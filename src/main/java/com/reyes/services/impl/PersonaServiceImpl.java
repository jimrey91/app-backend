package com.reyes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyes.model.Persona;
import com.reyes.repo.IPersonaRepo;
import com.reyes.services.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public Persona registrar(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public Persona actualizar(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		return null;
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
