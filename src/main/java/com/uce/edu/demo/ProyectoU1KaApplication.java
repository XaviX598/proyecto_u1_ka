package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.edu.demo.cine.service.IReservaService;

import com.uce.edu.demo.cine.modelo.*;

@SpringBootApplication
public class ProyectoU1KaApplication implements CommandLineRunner {

	@Autowired
	private SalaNormal normal;
	
	@Autowired
	private SalaNormal normal1;
	
	@Autowired
	private SalaNormal normal2;
	
	@Autowired
	private SalaVip vip;
	
	@Autowired
	private SalaVip vip1;
	
	@Autowired
	private SalaVip vip2;
	
	@Autowired
	private IReservaService iReservaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("---------------------------\n");
		System.out.println("EJEMPLO SINGLETON");
		System.out.println();
		this.normal.setCosto(new BigDecimal(6));
		this.normal.setNumeroAsientos(40);
		this.normal.setNumeroSala("A5");
		System.out.println(this.normal);
		System.out.println();
		this.normal.setCosto(new BigDecimal(6));
		this.normal1.setNumeroAsientos(30);
		this.normal1.setNumeroSala("A1");
		System.out.println(this.normal);
		System.out.println();
		this.normal.setCosto(new BigDecimal(6));
		this.normal2.setNumeroAsientos(35);
		this.normal2.setNumeroSala("A2");
		System.out.println(this.normal);
		System.out.println("---------------------------");
		System.out.println();
		this.normal1.setCosto(new BigDecimal(6));
		this.normal1.setNumeroSala("A3");
		this.normal1.setNumeroAsientos(25);
		System.out.println(this.normal1);
		System.out.println("---------------------------");
		System.out.println();
		this.normal2.setCosto(new BigDecimal(6));
		this.normal2.setNumeroSala("A4");
		this.normal2.setNumeroAsientos(40);
		System.out.println(this.normal2);
		System.out.println("---------------------------\n");
		System.out.println("EJEMPLO PROTOTYPE");
		System.out.println();
		this.vip.setCosto(new BigDecimal(12));
		this.vip.setNumeroAsientos(40);
		this.vip.setNumeroSala("Sala Vip");
		System.out.println(this.vip);
		System.out.println("----------");
		System.out.println(this.vip1);
		System.out.println("----------");
		System.out.println(this.vip2);
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Xavier");
		cliente.setApellido("Aguilar");
		cliente.setCvv(254);
		cliente.setNumeroTarjeta(12132123);
		
		Pelicula peli = new Pelicula();
		peli.setNombre("Spiderman");
		peli.setCategoria("Superheroes");
		
		Reserva reserva =new Reserva(cliente);
		reserva.setCliente(cliente);
		reserva.setHorarioPelicula(LocalDateTime.of(2022, 5, 3, 2, 0));
		reserva.setPelicula(peli);
		this.iReservaService.ingresar(reserva);
		
	}

}