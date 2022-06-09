package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service // para todo lo que es logica de negocio
public class TransferenciaServiceImpl implements ITransferenciaService {

	// como la logica de CuentaBancariaService no hace nada
	// si puedo inyectar el CuentaBancariaRepository
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		// con el numero de la cuenta que recibimos consultamos el saldo que tenga la
		// cuenta
		// 1.buscamos cuenta
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		// 2.obtenemos saldo
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		// 3.restamos la transferencia (cuando usamos dinero se hace .subtract)
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		// 4.seteamos nuevo saldo
		cOrigen.setSaldo(nuevoSaldoOrigen);
		// 5.actualizamos la cuenta
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		// añadimos el monto (cuando usamos dinero se hace .add)
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);

		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaD(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.iTransferenciaRepository.insertar(t);
	}

	@Override
	public Transferencia buscarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscar(t);
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.actualizarTrans(t);
	}

	@Override
	public void eliminarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.eliminarTrans(t);
	}

}
