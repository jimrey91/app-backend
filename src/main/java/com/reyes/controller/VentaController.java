package com.reyes.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.reyes.model.Persona;
import com.reyes.model.Venta;
import com.reyes.services.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService service;
	
	@PostMapping
	public ResponseEntity<Venta> registrar(@Valid @RequestBody Venta venta){
		Venta v = service.registrar(venta);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(v.getIdVenta()).toUri();
		
		return ResponseEntity.created(location).build();			
	}
	
	/*
	 * @PutMapping public ResponseEntity<Persona> actualizar(@Valid @RequestBody
	 * Persona persona){ Persona p = service.actualizar(persona); return new
	 * ResponseEntity<Persona>(p, HttpStatus.CREATED); }
	 */
	
	@GetMapping
	public ResponseEntity<List<Venta>> listar(){
		List<Venta> lista = service.listar();
		return new ResponseEntity<List<Venta>>(lista, HttpStatus.OK);
	}
	
/*	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		Persona p = service.listarPorId(id);
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		
		
	}*/

}
