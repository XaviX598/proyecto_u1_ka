package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void realizarRetiro(String numeroCuenta, BigDecimal monto) {

		CuentaBancaria ctaOrigen = this.bancariaService.buscar(numeroCuenta);
		BigDecimal saldoCtaOrigen = ctaOrigen.getSaldo();
		BigDecimal saldoFinal = saldoCtaOrigen.subtract(monto);
		ctaOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaOrigen);

		Retiro r = new Retiro();
		r.setFecha(LocalDateTime.now());
		r.setMontoRetiro(monto);
		r.setNumeroCuentaOrigen(numeroCuenta);
		this.iRetiroRepository.ingresarRetiro(r);

	}

	@Override
	public Retiro buscarRetiro(String numeroCuenta) {

		return this.iRetiroRepository.buscarRetiro(numeroCuenta);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizar(r);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.eliminarRetiro(numeroCuenta);
	}

}
