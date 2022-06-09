package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void ingresarRetiro(Retiro r);

	public Retiro buscarRetiro(String numeroCuenta);

	public void actualizar(Retiro t);

	public void eliminarRetiro(String numeroCuenta);

}
