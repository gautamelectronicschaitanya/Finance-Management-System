package com.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class FmsRespository {

	
	@PersistenceContext
	EntityManager entityManager;
	
	
	@Transactional
	public void add(Object object){
		entityManager.merge(object);
	}
	
	@Transactional
	public Object fetchById(Class clazz, Object pk){
		return entityManager.find(clazz,pk);
	}
	
}
