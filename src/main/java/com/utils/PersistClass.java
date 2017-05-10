package com.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class PersistClass<T extends EntityId<?>> {

		
	public T save(T entity){
		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetosala");
			EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		T entitySaved = null;
		if(entity.getId() != null) {
			entitySaved = entityManager.merge(entity);
		} else {
			entityManager.persist(entity);
			entitySaved = entity;
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		return entitySaved;
	}
	
}
