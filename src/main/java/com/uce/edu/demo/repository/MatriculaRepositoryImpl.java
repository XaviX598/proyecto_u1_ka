package com.uce.edu.demo.repository;


import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado una nueva matricula: "+numero);
		
	}


	@Override
	public void actualizar(Matricula numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado una matricula: "+numero);
		
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado una matricula: "+numero);
		
		return null;
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado una matricula: "+numero);
		
	}

}
