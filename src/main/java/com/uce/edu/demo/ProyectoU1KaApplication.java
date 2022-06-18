package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.edu.demo.cine.service.IReservaService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;
import com.uce.edu.demo.cine.modelo.*;

@SpringBootApplication
public class ProyectoU1KaApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorGeneral general1;
	
	@Autowired
	private ProfesorMateria materia;
	
	@Autowired
	private ProfesorMateria materia1;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		System.out.println("EJEMPLO SINGLETON");
		this.general.setNombre("Xavier");
		this.general.setApellido("Aguilar");
		
		System.out.println(this.general);
		this.general1.setNombre("Pepito");
		System.out.println("---------------------------");
		System.out.println(this.general1);
		
		System.out.println("---------------------------");
		System.out.println(this.general1);
		
		System.out.println("EJEMPLO PROTOTYPE");
		this.materia.setNombre("Kevin");
		this.materia.setApellido("Velasco");
		System.out.println(this.materia);
		System.out.println("----------");
		System.out.println(this.materia1);
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("13123");
		this.iMatriculaService.ingresarMatricula(matricula1);
		
	}
}