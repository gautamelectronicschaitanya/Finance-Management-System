/**
 * @author Chaitanay Gautam
 * This is a administrator repository class use to create a link between the various layers with the RDBMS
 */
package com.demo.repository;
import com.demo.entity.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class AdministratorRepository {
	 
	  
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Object object){
		entityManager.merge(object);
	}
	
	@Transactional
	public Object fetchById(Class clazz, Object pk){
		return entityManager.find(clazz,pk);
	}
	
//	public List<AdministratorEntityUserBankDetails> getDetails()
//	{
//		String sql ="Select d form AdministratorEntityUserBankDetails d";
//		Query q=entityManager.createQuery(sql);
//		return q.getResultList();
//		
//		
//	}
}
