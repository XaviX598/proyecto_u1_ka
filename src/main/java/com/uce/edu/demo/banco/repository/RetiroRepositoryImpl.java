package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void ingresarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha hecho valido su retiro: " + r);
	}

	@Override
	public Retiro buscarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub

		System.out.println("Completada la busqueda de su retiro : " + numeroCuenta);
		Retiro r = new Retiro();
		r.setFecha(LocalDateTime.now());
		r.setMontoRetiro(new BigDecimal(50));
		r.setNumeroCuentaOrigen("54");
		return r;
	}

	@Override
	public void actualizar(Retiro t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado su retiro: " + t);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado su retiro en la cuenta: " + numeroCuenta);
	}

}
