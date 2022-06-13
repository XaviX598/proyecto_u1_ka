package com.uce.edu.demo.supermercado.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.supermercado.modelo.Producto;
@Repository
public class ProductoRepositoryImpl implements IProductoRepository{
	
	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("\nProducto creado exitosamente: " + p + "\n");
	}

	@Override
	public Producto buscar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("\nEl producto creado con fecha es: " + fechaIngreso + " es: \n");
		Producto p = new Producto();
		p.setFecha(fechaIngreso);
		return p;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("\nActualizacion exitosa de: " + p + "\n");
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("\nEliminado exitosamente: " + nombre + "\n");
	}


}
