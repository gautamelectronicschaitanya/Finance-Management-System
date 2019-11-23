package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Registeration;
import com.lti.repository.UserDetailsRepository;

@Service
public class RegisterationService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public void register(Registeration registeration){
		Registeration reg =(Registeration)userDetailsRepository.insertUser(registeration);
		registeration.setuID(reg.getuID());
	
	}
}
