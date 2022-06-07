package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	
	//CRUD 
		//c:Crear /insertar
		public void insertar(Materia m);
		
		//r:leer/read/buscar
		public Materia buscar(String nombre); 
		
		//u: update/actualizar
		public void actualizar(Materia semestre); 
		
		//d:delete/eliminar
		public void eliminar(String nombre);

}
