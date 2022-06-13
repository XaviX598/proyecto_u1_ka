package com.uce.edu.demo.supermercado.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.supermercado.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto p);

	public Producto buscar(LocalDateTime fechaIngreso);

	public void actualizar(Producto p);

	public void eliminar(String nombre);

}
