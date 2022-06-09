package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public Transferencia buscarTransferencia(Transferencia t);

	public void actualizarTransferencia(Transferencia t);

	public void eliminarTransferencia(Transferencia t);

}