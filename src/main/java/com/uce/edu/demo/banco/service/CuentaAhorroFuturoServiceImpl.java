package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("futuro")
public class CuentaAhorroFuturoServiceImpl implements ICuentaBancariaService{

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ingresarCuenta(String numero, BigDecimal dinero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCuenta(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal interes = saldo.multiply(new BigDecimal(10)).divide(new BigDecimal(100));
		interes = interes.add(saldo.divide(new BigDecimal(100)));
		System.out.println("El interes de la cuenta de ahorro programado es: ");
		return interes;
	}

}
