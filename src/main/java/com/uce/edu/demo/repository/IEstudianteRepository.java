package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
//solo contratos en la interfaz
public interface IEstudianteRepository {
	//CRUD 
	//c:Crear /insertar
	public void insertar(Estudiante e);
	
	//r:leer/read/buscar
	public Estudiante buscar(String apellido); //ya que estamos buscando estudiantes, busca por cualqquier criterio
	
	//u: update/actualizar
	public void actualizar(Estudiante e); //enviamos el estudiante
	
	//d:delete/eliminar
	public void eliminar(String cedula);//eliminamos por cedula

}
