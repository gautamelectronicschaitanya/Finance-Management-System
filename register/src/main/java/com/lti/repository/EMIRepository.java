package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class EMIRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Object fetchById(Class claz, int pkey){	          //             //fetch data from EMI table
		
		Object obj= entityManager.find(claz, pkey);
		System.out.println("in dao");
		return obj;
	}
}
