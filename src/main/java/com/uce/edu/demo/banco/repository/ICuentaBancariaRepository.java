package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public void ingresarCuenta(String numero, BigDecimal dinero);

	public void actualizar(CuentaBancaria c);

	public CuentaBancaria buscar(String numero);

	public void eliminarCuenta(String numero);

}
