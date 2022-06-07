package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cine.Reserva;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMateriaRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1KaApplication implements CommandLineRunner{
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMatriculaRepository matriRepository;
	@Autowired
	private IMateriaRepository mateRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1723344567");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("0923344567");
		this.estudianteService.ingresarEstudiante(e1);
		
		Estudiante e2 = new Estudiante();
		e2.setNombre("Juan");
		e2.setApellido("Soria");
		e2.setCedula("0987944567");
		this.estudianteService.ingresarEstudiante(e2);
		
		//Usar los 3 metodos restantes
		e.setCedula("1754564651");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("1723344567");
		
		//**********************MATERIA
		//insertar
		Materia m = new Materia();
		m.setNombre("Programacion avanzada");
		m.setSemestre("Quinto");
		
		this.mateRepository.insertar(m);
		//insertar
		Materia m1 = new Materia();
		m1.setNombre("Inteligencia artificial");
		m1.setSemestre("Sexto");
		
		this.mateRepository.insertar(m1);
		//insertar
		Materia m2 = new Materia();
		m2.setNombre("Investigacion");
		m2.setSemestre("Sexto");
		
		this.mateRepository.insertar(m2);
		
		//actualizar
		m.setSemestre("Primero");
		this.mateRepository.actualizar(m);
		//buscar
		this.mateRepository.buscar("Programacion avanzada");
		//eliminar
		this.mateRepository.eliminar("Inteligencia artificial");
		
		//**********************MATRICULA
		//creao las listas de materias
		List<Materia> materiasSextoSemestre = new ArrayList<Materia>();
		materiasSextoSemestre.add(m1);
		materiasSextoSemestre.add(m2);
		
		List<Materia> materiasPrimerSemestre = new ArrayList<Materia>();
		materiasPrimerSemestre.add(m);
		
		//insertar
		Matricula mat = new Matricula();
		mat.setNumero("879848941");
		mat.setEstudiante(e);
		mat.setMateria(materiasSextoSemestre);
		this.matriRepository.insertar(mat);
		//insertar
		Matricula mat1 = new Matricula();
		mat1.setNumero("875121545");
		mat1.setEstudiante(e1);
		mat1.setMateria(materiasPrimerSemestre);
		this.matriRepository.insertar(mat1);
		//insertar
		Matricula mat2 = new Matricula();
		mat2.setNumero("54611545");
		mat2.setEstudiante(e2);
		mat2.setMateria(materiasSextoSemestre);
		this.matriRepository.insertar(mat2);
		//buscar
		this.matriRepository.buscar("8798489415");
		//actualizar
		mat1.setNumero("5456748974");
		this.matriRepository.actualizar(mat1);
		//eliminar
		this.matriRepository.eliminar("54611545");
		
		
	}

}
