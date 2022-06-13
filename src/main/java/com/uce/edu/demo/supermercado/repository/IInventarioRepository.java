package com.uce.edu.demo.supermercado.repository;

import com.uce.edu.demo.supermercado.modelo.Inventario;

public interface IInventarioRepository {

	public void insertar(Inventario i);

	public Inventario buscar(String codigo);

	public void actualizar(Inventario i);

	public void eliminar(String codigo);

}
