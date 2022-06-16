package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cine.modelo.Reserva;
import com.uce.edu.demo.cine.modelo.SalaNormal;
import com.uce.edu.demo.cine.modelo.SalaVip;
import com.uce.edu.demo.cine.repository.IReservaRepository;
@Service
public class ReservaServiceImpl implements IReservaService{
	@Autowired
	private IReservaRepository iReservaRepository;
	@Autowired
	private SalaNormal salaNormal;
	@Autowired
	private SalaVip salaVip;
	
	@Override
	public void ingresar(Reserva r) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+ this.salaVip);
		System.out.println("DI desde Service PROTOTYPE "+ this.salaNormal);
		this.iReservaRepository.ingresar(r);
	}

}
