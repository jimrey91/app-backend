package com.reyes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Detalle_Venta")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idDetalleVenta;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name ="id_venta", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_venta"))
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name ="id_producto", nullable = false, foreignKey = @ForeignKey(name = "FK_detalle_producto"))
	private Producto producto;
	
	@Column(name = "cantidad", nullable= false)
	private Integer cantidad;

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}


	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	

}
