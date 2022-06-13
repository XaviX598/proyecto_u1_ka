package com.uce.edu.demo.supermercado.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("\nInventario creado correctamente: \n" + i);
	}

	@Override
	public Inventario buscar(String codigo) {
		// TODO Auto-generated method stub
		System.out.println("\nBusqueda exitosa del codigo: " + codigo + "\n");
		Inventario inv = new Inventario();
		inv.setCodigo(codigo);
		return inv;
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("\nActualizacion exitosa: " + i + "\n");
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("\nEliminado correctamente de: " + nombre + "\n");
	}

}
