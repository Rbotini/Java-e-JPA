package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import dominio.Pessoa;

@SuppressWarnings("unused")
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(null,"Nelci","botinirenato@gmail.com");
		Pessoa p2 = new Pessoa(null,"Ricardo","botiniricardo@gmail.com");
		Pessoa p3 = new Pessoa(null,"Patricia","botinipatricia@gmail.com");
		Pessoa p4 = new Pessoa(null,"Daniela","botinidaniela@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();
		
		

	}

}
