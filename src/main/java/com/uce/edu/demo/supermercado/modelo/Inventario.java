package com.uce.edu.demo.supermercado.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Inventario {

	private List<Producto> productos;
	private String codigo;

	@Override
	public String toString() {
		return "Inventario de código: " + codigo + ", \n Productos: \n " + productos;
	}

	//set y get
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Producto> getProducto() {
		return productos;
	}

	public void setProducto(List<Producto> producto) {
		this.productos = producto;
	}

}
