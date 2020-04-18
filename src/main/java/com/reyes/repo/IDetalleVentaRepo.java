package com.reyes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyes.model.DetalleVenta;

@Repository
public interface IDetalleVentaRepo extends JpaRepository<DetalleVenta, Integer>{

}
