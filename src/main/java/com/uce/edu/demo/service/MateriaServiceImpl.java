package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;

import com.uce.edu.demo.repository.IMateriaRepository;
@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	IMateriaRepository matRepository;
	
	
	

	@Override
	public void ingresarMateria(Materia ma) {
		// TODO Auto-generated method stub
		this.matRepository.insertar(ma);
	}

	@Override
	public Materia buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		return this.matRepository.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia ma) {
		// TODO Auto-generated method stub
		this.matRepository.actualizar(ma);
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.matRepository.eliminar(nombre);
	}

}
