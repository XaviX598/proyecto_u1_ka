package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cine.modelo.Cliente;
import com.uce.edu.demo.cine.repository.IClienteRepository;
@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteRepository	iClienteRepository;
	
	@Override
	public void ingresar(Cliente c) {
		// TODO Auto-generated method stub
		this.iClienteRepository.ingresar(c);
	}
	
	

}
