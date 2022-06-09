package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);

	public Deposito buscarDeposito(String numeroCuenta);

	public void actualizarDeposito(Deposito d);

	public void eliminarDeposito(String numeroCuenta);

}
