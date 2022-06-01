package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	//no siempre coinciden con la interfaz
	
		public void ingresarEstudiante(Estudiante e);
		
		public Estudiante buscarApellido(String apellido); 
	
		public void actualizarEstudiante(Estudiante e); 
		
		public void borrarEstudiante(String cedula);

}
