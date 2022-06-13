package com.uce.edu.demo.supermercado.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.supermercado.modelo.Inventario;

public interface IGestorInventarioService {

	public void reporte(LocalDateTime fechaIngreso, Inventario inventario);
}
