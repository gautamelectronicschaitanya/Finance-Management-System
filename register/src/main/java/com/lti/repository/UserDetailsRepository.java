package com.lti.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import com.lti.entity.BankDetails;
import com.lti.entity.Registeration;

@Repository
public class UserDetailsRepository {  //dao class for interacting with database

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public Object insertUser(Object object){ //insert user data - mapping registeration class into the table 
		
		Object obj=	entityManager.merge(object);
		return obj;
	}
	
	@Transactional
	public Object insertBankDetails(Object object){                  //insert bank details of the user
	Object obj=	entityManager.merge(object);
	return obj;
		
	}
	
	
	@Transactional
	public Object fetchById(Class claz, int pkey){	          //             //fetch username and password
		
		Object obj= entityManager.find(claz, pkey);
		System.out.println("in dao");

		
		return obj;
	}



	@Transactional
		public boolean loginCheck(String username, String password){
		String sql = "select count(c) from Registeration c where username = username and password= password";
		Query q = (Query) entityManager.createQuery(sql);
		
		Number i=(Number)q.getSingleResult();
		
		if(i.intValue()>0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
			
		}
	
}
	
