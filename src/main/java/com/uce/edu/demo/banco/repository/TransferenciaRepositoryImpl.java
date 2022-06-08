package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository 
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		
		System.out.println("Aqui se inserta la transferencia en la base de datos " +t);
	}

}
