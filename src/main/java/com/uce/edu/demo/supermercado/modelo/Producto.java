package com.uce.edu.demo.supermercado.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombre;
	private BigDecimal precioInicial;
	private BigDecimal precioFinal;
	private int cantidad;
	private LocalDateTime fecha;

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioInicial=" + precioInicial + ", precioFinal=" + precioFinal
				+ ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
	}

	// set y get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioInicial() {
		return precioInicial;
	}

	public void setPrecioInicial(BigDecimal precioInicial) {
		this.precioInicial = precioInicial;
	}

	public BigDecimal getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(BigDecimal precioFinal) {
		this.precioFinal = precioFinal;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
