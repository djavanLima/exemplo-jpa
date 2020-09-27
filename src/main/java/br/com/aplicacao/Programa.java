package br.com.aplicacao;

import br.com.dominio.Pessoa;

public class Programa {

	
	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa(1, "Carlos Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(2, "Luna Silva", "Luana@gmail.com");
		Pessoa p3 = new Pessoa(3, "Djavan Silva", "Djavan@gmail.com");
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
	
	
	
	
	
}
