
package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {

		System.out.println("transferencia completada " + t);
	}

	@Override
	public Transferencia buscar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado la transferencia: " + t);
		Transferencia trans = new Transferencia();
		trans.setFechaTransferencia(LocalDateTime.now());
		trans.setMontoTransferir(new BigDecimal(80));
		trans.setNumeroCuentaD("545456");
		trans.setNumeroCuentaOrigen("45454");
		return trans;
	}

	@Override
	public void actualizarTrans(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("se ha buscado la transferencia: " + t);
	}

	@Override
	public void eliminarTrans(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("SE ha eliminado exitosamente su transferencia: " + t);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//Aqui debería estar el SQL a la base
		List<Transferencia> listaConsultada = new ArrayList<>();
		
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaD("1234");
		trans1.setNumeroCuentaOrigen("12567");
		listaConsultada.add(trans1);
		
		return listaConsultada;
	}

}
