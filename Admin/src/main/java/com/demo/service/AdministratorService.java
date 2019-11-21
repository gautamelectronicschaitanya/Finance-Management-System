/**
 * @author Chaitanay Gautam
 * This is the Administrator Service class holding business logic
 */


package com.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.demo.entity.AdminDetails;
import com.demo.repository.AdminRepository;


@Service()
public class AdministratorService {
	
@Autowired
AdminRepository adminrepo;
	
	public boolean LoginValidate(String adminName, String adminPassword)
	{
		 
		
		return false;
	}
	


}
