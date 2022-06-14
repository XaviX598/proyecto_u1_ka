package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService ICuentaBancariaService;
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iCuentaBancariaServiceA;

	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);
		if (cta.getTipo().equals("A")) {
			// ahorros
			interes = this.iCuentaBancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		} else {
			// corriente
			interes = this.ICuentaBancariaService.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}

}
