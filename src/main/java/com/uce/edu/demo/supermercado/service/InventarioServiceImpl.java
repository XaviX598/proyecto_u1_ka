package com.uce.edu.demo.supermercado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void ingresarInventario(Inventario i) {
		this.iInventarioRepository.insertar(i);
	}
}
