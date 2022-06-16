package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cine.modelo.Pelicula;
import com.uce.edu.demo.cine.repository.IPeliculaRepository;
@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	private IPeliculaRepository iPeliculaRepository;
	@Override
	public void ingresar(Pelicula p) {
		// TODO Auto-generated method stub
		this.iPeliculaRepository.inrgesar(p);
	}

}
