package com.uce.edu.demo.cine.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SalaNormal {

	private BigDecimal costo;
	private String numeroSala;
	private int numeroAsientos;

	@Override
	public String toString() {
		return "SalaNormal [costo=" + costo + ", numeroSala=" + numeroSala + ", numeroAsientos=" + numeroAsientos + "]";
	}

	// set y get
	public String getNumeroSala() {
		return numeroSala;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

}
