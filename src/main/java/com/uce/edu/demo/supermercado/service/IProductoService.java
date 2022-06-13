package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.repository.IProductoRepository;

public interface IProductoService {

	public void insertarProducto(Producto p);
}
