package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorros")
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService{
	
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
		//codigo duplicado lo solucionamos con una fachada, gestor
		//CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);
//		BigDecimal saldo = null;
		BigDecimal interes= new BigDecimal(560).multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		interes =interes.add( saldo.divide(new BigDecimal(10)));
		return interes;
	}

}
