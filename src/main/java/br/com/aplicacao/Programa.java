package br.com.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.dominio.Pessoa;

public class Programa {

	
	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa(null, "Evandro", "evandro@gmail.com");
		Pessoa p2 = new Pessoa(null, "Luna", "luana@gmail.com");
		Pessoa p3 = new Pessoa(null, "Djavan", "djavan@gmail.com");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // o mesmo que está no xml
		EntityManager em = emf.createEntityManager();
	
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		
	}
	
	
	
	
	
}
