package com.reyes.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idVenta;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name ="id_persona", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_persona"))
	private Persona persona;
	
	@Column(name = "importe", nullable = false)
	private double importe;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	

}
