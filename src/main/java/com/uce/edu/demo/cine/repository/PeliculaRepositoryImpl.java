package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.cine.modelo.Pelicula;
@Repository
public class PeliculaRepositoryImpl implements IPeliculaRepository{

	@Override
	public void inrgesar(Pelicula p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado la pelicula: "+p);
	}

}
