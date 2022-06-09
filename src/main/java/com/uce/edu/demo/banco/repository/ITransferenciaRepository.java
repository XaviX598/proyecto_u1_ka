package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);

	public Transferencia buscar(Transferencia t);

	public void actualizarTrans(Transferencia t);

	public void eliminarTrans(Transferencia t);

}
