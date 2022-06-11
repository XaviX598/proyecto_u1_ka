package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private IDepositoService iDepositoService;
	@Autowired
	private IRetiroService iRetiroService;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	@Autowired
	private IDepositoRepository iDepositoRepository;
	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.realizarRetiro(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTo> consultarTransacciones(String cuenta, LocalDateTime fechaInicio,
			LocalDateTime fechaFin) {
		// TODO Auto-generated method stub

		List<Transferencia> listaTrans = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);

		// vamos a unir todas las listas en una nueva lista
		List<TransaccionTo> listaFinal = new ArrayList<>();
		for (Transferencia t : listaTrans) {

			TransaccionTo transaccionTO = this.transformar(t);
			listaFinal.add(transaccionTO);
		}

		for (Deposito d : listaDepo) {

			TransaccionTo transaccionTO = this.transformar(d);
			listaFinal.add(transaccionTO);
		}
		for (Retiro r : listaReti) {

			TransaccionTo transaccionTO = this.transformar(r);
			listaFinal.add(transaccionTO);
		}

		return listaFinal;
	}

	// transformar una transferencia a una transcaccion
	private TransaccionTo transformar(Transferencia transferencia) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(transferencia.getFechaTransferencia());
		tranTo.setMonto(transferencia.getMontoTransferir());
		tranTo.setTipo("T");
		return tranTo;
	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(deposito.getFeha());
		tranTo.setMonto(deposito.getMontoDeposito());
		tranTo.setTipo("D");
		return tranTo;

	}

	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(retiro.getFecha());
		tranTo.setMonto(retiro.getMontoRetiro());
		tranTo.setTipo("R");
		return tranTo;
	}

}
