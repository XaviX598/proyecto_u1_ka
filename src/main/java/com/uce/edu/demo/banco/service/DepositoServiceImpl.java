package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {
	// servicio que nos da la cuenta
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iCuentaBancariaService;
	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.iCuentaBancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.iCuentaBancariaService.actualizar(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setFeha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMontoDeposito(monto);
		this.depositoRepository.insertarDeposito(deposito);

	}

	@Override
	public Deposito buscarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscarDeposito(numeroCuenta);
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizarDeposito(d);
	}

	@Override
	public void eliminarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminarDeposito(numeroCuenta);
	}

}
