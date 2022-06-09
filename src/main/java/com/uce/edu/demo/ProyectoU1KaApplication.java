package com.uce.edu.demo;

import java.math.BigDecimal;
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

@SpringBootApplication
public class ProyectoU1KaApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	private ITransferenciaService iTransferenciaService;

	@Autowired
	private IDepositoService iDepositoService;

	@Autowired
	private IRetiroService iRetiroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// *****************CUENTA BANCARIA

		CuentaBancaria c = new CuentaBancaria();

		c.setNumero("1234");
		c.setSaldo(new BigDecimal(800));

		CuentaBancaria c1 = new CuentaBancaria();

		c1.setNumero("7894");
		c1.setSaldo(new BigDecimal(800));

		CuentaBancaria c2 = new CuentaBancaria();

		c2.setNumero("1111");
		c2.setSaldo(new BigDecimal(700));

		this.iCuentaBancariaService.ingresarCuenta("1234", new BigDecimal(800));

		c2.setNumero("454");
		System.out.println("\n");
		this.iCuentaBancariaService.actualizar(c2);
		System.out.println("\n");
		this.iCuentaBancariaService.buscar("454");
		System.out.println("\n");
		this.iCuentaBancariaService.eliminarCuenta("1234");
		System.out.println("\n");
//		//******************TRANSFERENCIA 
//
		Transferencia t = new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setMontoTransferir(new BigDecimal(80));
		t.setNumeroCuentaD("454");
		t.setNumeroCuentaOrigen("7894");

		Transferencia t1 = new Transferencia();
		t1.setFechaTransferencia(LocalDateTime.now());
		t1.setMontoTransferir(new BigDecimal(80));
		t1.setNumeroCuentaD("7894");
		t1.setNumeroCuentaOrigen("454");

		this.iTransferenciaService.realizarTransferencia("454", "7894", new BigDecimal(20));
		System.out.println("\n");
		this.iTransferenciaService.buscarTransferencia(t1);
		System.out.println("\n");
		t1.setMontoTransferir(new BigDecimal(501));
		this.iTransferenciaService.actualizarTransferencia(t1);
		System.out.println("\n");
		this.iTransferenciaService.eliminarTransferencia(t);
		System.out.println("\n");

//		//******************DEPOSITO 
		Deposito d = new Deposito();
		d.setFeha(LocalDateTime.now());
		d.setMontoDeposito(new BigDecimal(20));
		d.setNumeroCuentaDestino("7894");

		Deposito d1 = new Deposito();
		d1.setFeha(LocalDateTime.now());
		d1.setMontoDeposito(new BigDecimal(20));
		d1.setNumeroCuentaDestino("1111");

		this.iDepositoService.realizarDeposito("1111", new BigDecimal(50));
		System.out.println("\n");
		this.iDepositoService.buscarDeposito("1234");
		System.out.println("\n");
		d1.setMontoDeposito(new BigDecimal(90));
		this.iDepositoService.actualizarDeposito(d);
		System.out.println("\n");
		this.iDepositoService.eliminarDeposito("7894");
		System.out.println("\n");

		// ******************RETIRO
		Retiro r = new Retiro();
		r.setFecha(LocalDateTime.now());
		r.setMontoRetiro(new BigDecimal(30));
		r.setNumeroCuentaOrigen("66654");

		Retiro r1 = new Retiro();
		r1.setFecha(LocalDateTime.now());
		r1.setMontoRetiro(new BigDecimal(30));
		r1.setNumeroCuentaOrigen("65445");

		this.iRetiroService.realizarRetiro("1234", new BigDecimal(40));
		System.out.println("\n");
		this.iRetiroService.buscarRetiro("66654");
		System.out.println("\n");
		r.setMontoRetiro(new BigDecimal(80));
		this.iRetiroService.actualizarRetiro(null);
		System.out.println("\n");
		this.iRetiroService.eliminarRetiro("65445");

	}

}
