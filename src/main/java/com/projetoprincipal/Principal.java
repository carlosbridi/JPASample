package com.projetoprincipal;

import com.sala.Sala;
import com.sala.SalaPersistence;

public class Principal {

	public static void main(String[] args) {
		
		Sala sala = new Sala();
		sala.setCodigoSala("1ª A");
		sala.setNomeSala("Turma Joao Augusto");
		
		SalaPersistence salaPersistence = new SalaPersistence();
		salaPersistence.save(sala);	
		
	}
	
}
