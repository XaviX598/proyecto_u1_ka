package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;

@Service
public class GestorInventarioSeriviceImpl implements IGestorInventarioService {
	
	@Override
	public void reporte(LocalDateTime fechaIngreso, Inventario inventario) {
		
		System.out.println("Reporte creado con exito");
		System.out.println("La fecha asignada es: " + fechaIngreso);
		System.out.println();

		//para imprimir y comparar las fechas
		for (Producto producto : inventario.getProducto()) {
			if (fechaIngreso.compareTo(producto.getFecha()) < 0) {
				Producto producto1 = precioVenta(producto);
				System.out.println("Producto: " + producto1.getNombre() + " Cantidad: " + producto1.getCantidad() + " Pvp: $" + producto1.getPrecioFinal() + " Fecha de ingreso: "+ producto1.getFecha());
			}
		}
	}

	private Producto precioVenta(Producto p) {
		Producto producto = p;

		BigDecimal precioCompra = producto.getPrecioInicial();
		BigDecimal ganancia = precioCompra.multiply(new BigDecimal(0.1));
		BigDecimal impuesto = precioCompra.multiply(new BigDecimal(0.12));
		BigDecimal precioVenta = precioCompra.add(ganancia).add(impuesto);
		BigDecimal precioFinal = precioVenta.setScale(2, RoundingMode.HALF_UP);
		producto.setPrecioFinal(precioFinal);

		return producto;
	}
}