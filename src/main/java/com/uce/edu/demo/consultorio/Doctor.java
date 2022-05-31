package com.uce.edu.demo.consultorio;

import org.springframework.stereotype.Component;

//les damos una metadata
@Component

public class Doctor {
	private String nombre;
	private String apellido;
	private int edad;
	private String ciudad;
	
	

	

	// Set y Get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}
