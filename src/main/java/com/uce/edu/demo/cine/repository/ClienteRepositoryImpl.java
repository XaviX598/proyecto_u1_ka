package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.cine.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository{

	@Override
	public void ingresar(Cliente c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ionsertado un nuevo cliente: "+c);
	}

}
