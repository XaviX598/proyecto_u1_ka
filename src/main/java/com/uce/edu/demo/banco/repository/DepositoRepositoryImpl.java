package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui debería estar el SQL a la base
				List<Deposito> listaDepositos = new ArrayList<>();
				
				Deposito depo1 = new Deposito();
				depo1.setFeha(LocalDateTime.of(2021, 2,10,8,50,2));
				depo1.setMontoDeposito(new BigDecimal(20));
				depo1.setNumeroCuentaDestino("2345");
				
				listaDepositos.add(depo1);
				
				Deposito depo2 = new Deposito();
				depo2.setFeha(LocalDateTime.of(2021, 3,15,8,50,2));
				depo2.setMontoDeposito(new BigDecimal(40));
				depo2.setNumeroCuentaDestino("1345");
				
				listaDepositos.add(depo2);
				
				return listaDepositos;
		
		
	}

}
