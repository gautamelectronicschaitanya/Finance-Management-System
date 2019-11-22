/**
 * @author Chaitanay Gautam
 * This is a administrator repository class use to create a link between the various layers with the RDBMS
 */
package com.demo.repository;
import com.demo.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.TransactionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class AdminRepository {
	  
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
	
   @Transactional
   public List<BankDetails> fetchbyPk(int uid)
   {
	   String selectQuery="Select c from BankDetails c where c.usd.USERID=:uid";
		  Query q=entityManager.createQuery(selectQuery);
		  q.setParameter("uid",uid);
		  List<BankDetails> bk =q.getResultList();
         return bk;
   }
   
   
  @Transactional
   public AdminDetails fetchAll()
   {
	  AdminDetails ad;
	   String selectQuery ="Select d from AdminDetails as d";
	   Query q=entityManager.createQuery(selectQuery);
	   List<AdminDetails> bk =q.getResultList();
	   return bk.get(0);
   }
  
   
}
