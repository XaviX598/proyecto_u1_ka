package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private LocalDateTime fecha;
	private String numeroCuentaOrigen;
	private BigDecimal montoRetiro;
	

	

	@Override
	public String toString() {
		return "Retiro [fecha=" + fecha + ", numeroCuentaOrigen=" + numeroCuentaOrigen + ", montoRetiro=" + montoRetiro
				+ "]";
	}

	// set y get
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}

	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}

	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}

	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}

	

}
