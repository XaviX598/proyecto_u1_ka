package com.uce.edu.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.cine.Reserva;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMateriaRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.supermercado.modelo.Inventario;
import com.uce.edu.demo.supermercado.modelo.Producto;
import com.uce.edu.demo.supermercado.service.IGestorInventarioService;
import com.uce.edu.demo.supermercado.service.IInventarioService;

@SpringBootApplication
public class ProyectoU1KaApplication implements CommandLineRunner {

	@Autowired
	public IInventarioService iInventarioService;
	
	@Autowired
	private IGestorInventarioService iGestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Producto pro1 = new Producto();
		pro1.setNombre("Arroz");
		pro1.setPrecioInicial(new BigDecimal(30.50).setScale(2, RoundingMode.HALF_UP));
		pro1.setCantidad(10);
		pro1.setFecha(LocalDateTime.of(2022, 8, 4, 20, 40, 0));
		
		Producto pro2 = new Producto();
		pro2.setNombre("Carne");
		pro2.setPrecioInicial(new BigDecimal(8.30).setScale(2, RoundingMode.HALF_UP));
		pro2.setCantidad(5);
		pro2.setFecha(LocalDateTime.of(2022, 5, 5, 13, 40, 0));
		
		Producto pro3 = new Producto();
		pro3.setNombre("Pollo");
		pro3.setPrecioInicial(new BigDecimal(7.5).setScale(2, RoundingMode.HALF_UP));
		pro3.setCantidad(2);
		pro3.setFecha(LocalDateTime.of(2022, 9, 30, 11, 30, 30));
		
		Producto pro4 = new Producto();
		pro4.setNombre("Comida para perro");
		pro4.setPrecioInicial(new BigDecimal(29.50).setScale(2, RoundingMode.HALF_UP));
		pro4.setCantidad(3);
		pro4.setFecha(LocalDateTime.of(2022, 2, 4, 23, 20, 30));
		
		Producto pro5 = new Producto();
		pro5.setNombre("Leche");
		pro5.setPrecioInicial(new BigDecimal(1.00).setScale(2, RoundingMode.HALF_UP));
		pro5.setCantidad(3);
		pro5.setFecha(LocalDateTime.of(2022, 8, 6, 10, 15, 0));
		
		Producto pro6 = new Producto();
		pro6.setNombre("Salmon");
		pro6.setPrecioInicial(new BigDecimal(10.85).setScale(2, RoundingMode.HALF_UP));
		pro6.setCantidad(5);
		pro6.setFecha(LocalDateTime.of(2022, 3, 5, 12, 20, 0));

		
		List<Producto> producto1 = new ArrayList<>();
		producto1.add(pro1);
		producto1.add(pro2);
		producto1.add(pro4);
		producto1.add(pro5);
		producto1.add(pro3);
		producto1.add(pro6);
		
		Inventario inventario1 = new Inventario();
		inventario1.setCodigo("1");
		inventario1.setProducto(producto1);
		
		this.iInventarioService.ingresarInventario(inventario1);
		
		this.iGestorInventarioService.reporte(LocalDateTime.of(2022, 5, 12, 0, 0, 0), inventario1);
		
	}

}