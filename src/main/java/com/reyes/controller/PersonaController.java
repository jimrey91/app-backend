package com.reyes.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.reyes.model.Persona;
import com.reyes.services.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService service;
	
	@PostMapping
	public ResponseEntity<Persona> registrar(@Valid @RequestBody Persona persona){
		Persona p = service.registrar(persona);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdPersona()).toUri();
		return ResponseEntity.created(uri).build();			
	}
	
	@PutMapping
	public ResponseEntity<Persona> actualizar(@Valid @RequestBody Persona persona){
		Persona p = service.actualizar(persona);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(p.getIdPersona()).toUri();
		return ResponseEntity.created(uri).build();	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona> listarPorId(@PathVariable("id") Integer id){
		Persona per = service.listarPorId(id);
		return new ResponseEntity<Persona>(per, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Persona>> listar(){
		List<Persona> lista = service.listar();
		return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Persona p = service.listarPorId(id);
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);		
	}

}
