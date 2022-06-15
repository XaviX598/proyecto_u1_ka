package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	
	@Autowired
	IMatriculaRepository matriRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Override
	public void ingresarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE "+this.profesorMateria);
		this.matriRepository.insertar(ma);
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.matriRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula ma) {
		// TODO Auto-generated method stub
		this.matriRepository.actualizar(ma);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriRepository.eliminar(numero);
	}

}
