package com.reyes.controller;

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

import com.reyes.model.DetalleVenta;
import com.reyes.services.IDetalleVentaService;

@RestController
@RequestMapping("/detalleVentas")
public class DetalleVentaController {
	
	@Autowired
	private IDetalleVentaService service;
	
	@PostMapping
	public ResponseEntity<DetalleVenta> registrar(@Valid @RequestBody DetalleVenta detalleVenta){
		DetalleVenta d = service.registrar(detalleVenta);
		return new ResponseEntity<>(d, HttpStatus.CREATED);			
	}
	
	/*
	 * @PutMapping public ResponseEntity<DetalleVenta>
	 * actualizar(@Valid @RequestBody DetalleVenta persona){ DetalleVenta p =
	 * service.actualizar(persona); return new ResponseEntity<DetalleVenta>(p,
	 * HttpStatus.CREATED); }
	 */
	@GetMapping
	public ResponseEntity<List<DetalleVenta>> listar(){
		List<DetalleVenta> lista = service.listar();
		return new ResponseEntity<List<DetalleVenta>>(lista, HttpStatus.OK);
	}
	
	/*
	 * @DeleteMapping("/{id}") public ResponseEntity<Object>
	 * eliminar(@PathVariable("id") Integer id){ DetalleVenta p =
	 * service.listarPorId(id); service.eliminar(id); return new
	 * ResponseEntity<Object>(HttpStatus.NO_CONTENT); }
	 */
}
