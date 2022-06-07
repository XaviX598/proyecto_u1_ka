package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	
	public void ingresarMatricula(Matricula ma);
	
	public Matricula buscarMatricula(String numero); 

	public void actualizarMatricula(Matricula ma); 
	
	public void borrarMatricula(String numero);

}
