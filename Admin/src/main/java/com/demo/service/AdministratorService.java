/**
 * @author Chaitanay Gautam
 * This is the Administrator Service class holding business logic
 */


package com.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.demo.entity.AdminDetails;
import com.demo.repository.AdminRepository;


@Service()
public class AdministratorService {
	
@Autowired
AdminRepository adminrepo;
	
	public boolean LoginValidate(String adminName, String adminPassword)
	{
			
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AdminDetails ad =(AdminDetails) ar.fetchAll();
		if(ad.getAdminPassword().equals(adminPassword) && ad.getAdminName().equals(adminName))
		{
		      return true;
		}
		else
		{
			return false;
		}		
	}
	


}
