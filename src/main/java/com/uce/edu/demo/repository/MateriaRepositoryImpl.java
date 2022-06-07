package com.uce.edu.demo.repository;


import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;
@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la materia en la base de datos " + m);
	}

	@Override
	public Materia buscar(String nombre) {
		System.out.println("Se ha buscado en la base la materia: "+ nombre);
		Materia m = new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Materia m) {
		System.out.println("Se ha actualizado la materia en la base de datos " + m);
		
	}

	@Override
	public void eliminar(String nombre) {
		System.out.println("Se ha eliminado la materia en la base de datos " + nombre);
		
	}

}
