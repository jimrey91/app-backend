package com.reyes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyes.model.Venta;

@Repository
public interface IVentaRepo extends JpaRepository<Venta, Integer>{

}
