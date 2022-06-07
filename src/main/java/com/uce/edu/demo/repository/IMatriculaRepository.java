package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD 
			//c:Crear /insertar
			public void insertar(Matricula numero);
			
			//r:leer/read/buscar
			public Matricula buscar(String numero); 
			
			//u: update/actualizar
			public void actualizar(Matricula numero); 
			
			//d:delete/eliminar
			public void eliminar(String numero);

}
