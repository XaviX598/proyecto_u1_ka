package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.cine.modelo.Reserva;
@Repository
public class ReservaRepositoryImpl implements IReservaRepository{

	@Override
	public void ingresar(Reserva r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado su reserva: "+r);
	}

}
