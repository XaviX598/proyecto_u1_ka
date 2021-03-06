package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cine.Reserva;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1KaApplication implements CommandLineRunner{
	
	//1)DI por atributos
	//@Autowired
	//private CitaMedica cita;
	//@Autowired
	//private CitaMedica2 cita;
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework");
//		
//		
//		String respuesta=this.cita.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
//		System.out.println(respuesta);
//	}
	
	
	//DI por atributos
	@Autowired
	private Reserva reserva1;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String respuesta=this.reserva1.reservar(LocalDateTime.now(), "Xavier", "Aguilar", 546515616, 235, "Spiderman", "Superheroes");
		System.out.println(respuesta);
	}

}
