package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		// Aqui debería estar el SQL a la base
		List<Retiro> listaRetiros = new ArrayList<>();

		Retiro reti1 = new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setMontoRetiro(new BigDecimal(20));
		reti1.setNumeroCuentaOrigen("1239");

		listaRetiros.add(reti1);

		return listaRetiros;

	}

}
