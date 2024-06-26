package com.crudhibernate.cliente;

import com.crudhibernate.cliente.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	private static javax.persistence.EntityManager entityManager = entityManagerFactory.createEntityManager();
			
	public static void main(String[] args) {
		
	//	FIND
		Cliente cliente = entityManager.find(Cliente.class,1);
		System.out.println("Nome do cliente:" + cliente.getName());

	//	INSERT
	//	Cliente cliente = new Cliente();
	//	cliente.setName("GOOGLE");
		
	//	entityManager.getTransaction().begin();
	//	entityManager.persist(cliente);
	//	entityManager.getTransaction().commit();
		
	//	DELETE
	//	Cliente cliente = entityManager.find(Cliente.class,2);
	//	entityManager.getTransaction().begin();
	//	entityManager.remove(cliente);
	//	entityManager.getTransaction().commit();
	
	//	MODIFY
	//	Cliente cliente = new Cliente();
	//	cliente.setId(1);
	//	cliente.setName("FACEBOOK INC.");
	//	entityManager.getTransaction().begin();
	//	entityManager.merge(cliente);
	//	entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
