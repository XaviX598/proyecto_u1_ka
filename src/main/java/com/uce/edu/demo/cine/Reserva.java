package com.uce.edu.demo.cine;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Reserva {
	
	private LocalDateTime horarioPelicula;
	private Cliente cliente;
	private Pelicula pelicula;
	
	//DI por constructor
	
	public Reserva(Cliente cliente) {
		this.cliente= cliente;
	}
	
	public String reservar(LocalDateTime horarioPelicula, String nombreCliente, String apellidoCliente, int numeroTarjeta,int cvv,  String nombrePelicula,
			String categoria) {
		
		this.cliente.setNombre(nombreCliente);
		this.cliente.setApellido(apellidoCliente);
		this.cliente.setNumeroTarjeta(numeroTarjeta);
		this.cliente.setCvv(cvv);
		
		this.pelicula.setNombre(nombrePelicula);
		this.pelicula.setCategoria(categoria);
		
		this.horarioPelicula= horarioPelicula;


		// se inserta la cita en la base de datos
		return "Ticket reservado con exito";
	}
	
	
	public LocalDateTime getHorarioPelicula() {
		return horarioPelicula;
	}
	public void setHorarioPelicula(LocalDateTime horarioPelicula) {
		this.horarioPelicula = horarioPelicula;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	
	//DI mediante metodos set 
	@Autowired
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
	

}
