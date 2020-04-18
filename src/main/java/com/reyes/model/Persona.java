package com.reyes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idPersona;
	
	@Column(name = "nombres", nullable = false, length = 50)
	@Size(min= 3, message = "Debe tener al menos 3 caracteres")
	private String nombres;
	
	@Size(min= 3, message = "Debe tener al menos 3 caracteres")
	@Column(name = "apellidos", nullable = false, length= 50)
	private String apellidos;
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	

}
