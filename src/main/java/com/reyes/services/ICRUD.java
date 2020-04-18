package com.reyes.services;

import java.util.List;

public interface ICRUD <T,V>{
	
	T registrar(T obj);
	T actualizar(T obj);
	List<T> listar();
	T listarPorId(V id);
	boolean eliminar(V id);

}
