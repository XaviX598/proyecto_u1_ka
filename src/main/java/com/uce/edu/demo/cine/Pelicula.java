package com.uce.edu.demo.cine;

import org.springframework.stereotype.Component;

@Component
public class Pelicula {
	
	private String nombre;
	private String categoria;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
