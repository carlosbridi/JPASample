package com.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class PersistClass<T extends EntityId<?>> {

	private static EntityManager entityManager;
	
	public T save(T entity){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetosala");
		entityManager = emf.createEntityManager();
		
		T entitySave = null;
		
		entityManager.getTransaction().begin();
		try{
			if (entity.getId() != null){
				entitySave = entityManager.merge(entity);
			}else{
				entityManager.persist(entity);
				entitySave = entity;
			}
		}catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		finally{
			entityManager.getTransaction().commit();
		}
		
		
		return entitySave;
	}
	
}
