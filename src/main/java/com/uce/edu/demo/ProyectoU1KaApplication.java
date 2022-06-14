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
import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
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
	public IFachadaCuentaBancaria iFachadaCuentaBancaria;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		BigDecimal interes= this.iFachadaCuentaBancaria.calcularInteres("1234");
		
		System.out.println(interes);
	}

}