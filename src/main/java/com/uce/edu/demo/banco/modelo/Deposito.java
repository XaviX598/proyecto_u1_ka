package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {
	
	private LocalDateTime fecha;
	private String numeroCuentaDestino;
	private BigDecimal montoDeposito;
	
	
	@Override
	public String toString() {
		return "Deposito [fecha=" + fecha + ", numeroCuentaDestino=" + numeroCuentaDestino + ", montoDeposito="
				+ montoDeposito + "]";
	}
	
	//set y get
	public LocalDateTime getFeha() {
		return fecha;
	}
	public void setFeha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMontoDeposito() {
		return montoDeposito;
	}
	public void setMontoDeposito(BigDecimal montoDeposito) {
		this.montoDeposito = montoDeposito;
	}
	
	

}
