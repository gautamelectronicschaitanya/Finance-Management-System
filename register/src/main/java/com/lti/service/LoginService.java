package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Registeration;
import com.lti.repository.UserDetailsRepository;

@Service
public class LoginService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public boolean login(Registeration registeration){
		System.out.println("in login service--login()");

		String username = registeration.getUsername();
		String password = registeration.getPassword();
		
		//Registeration reg = userDetailsRepository.fetch(registeration.getUserID());
		
		boolean flag = userDetailsRepository.loginCheck(username, password);
		System.out.println("after fetching in loginservice");
		return flag;
	}	
}
