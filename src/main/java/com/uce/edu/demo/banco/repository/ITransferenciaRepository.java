package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);

	public Transferencia buscar(Transferencia t);

	public void actualizarTrans(Transferencia t);

	public void eliminarTrans(Transferencia t);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
