package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria c) {
		// Aqui hay que contruir los SQL's
		System.out.println("Cuenta Bancaria actualizada a: " + c);

	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: " + numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}

	@Override
	public void eliminarCuenta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado la cuenta: " + numero);
	}

	@Override
	public void ingresarCuenta(String numero, BigDecimal dinero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha agregado la cuenta: " + numero + "con un monto inicial de: " + dinero);

	}

}
