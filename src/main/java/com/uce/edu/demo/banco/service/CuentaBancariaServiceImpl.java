package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service // para todo lo que es logica de negocio
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}

	@Override
	public void ingresarCuenta(String numero, BigDecimal dinero) {
		// TODO Auto-generated method stub
		this.bancariaRepository.ingresarCuenta(numero, dinero);

	}

	@Override
	public void eliminarCuenta(String numero) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminarCuenta(numero);
	}

}
