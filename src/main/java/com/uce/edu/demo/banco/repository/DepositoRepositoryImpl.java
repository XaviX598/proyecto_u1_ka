package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado su deposito " + d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Busqueda completa de su deposito en la cuenta:: " + numeroCuenta);
		Deposito d = new Deposito();
		d.setFeha(LocalDateTime.now());
		d.setMontoDeposito(new BigDecimal(20));
		d.setNumeroCuentaDestino(numeroCuenta);
		return d;
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado su deposito " + d);
	}

	@Override
	public void eliminarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado su deposito en la cuenta: " + numeroCuenta);
	}

}
