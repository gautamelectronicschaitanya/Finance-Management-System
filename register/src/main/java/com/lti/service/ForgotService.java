package com.lti.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Registeration;
import com.lti.repository.UserDetailsRepository;

@Service
public class ForgotService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Autowired
	private SendMailService sendMailService;
	
	
	public void forgot(Registeration registeration){
//		String numbers = "0123456789"; 
//		Random rndm_method = new Random(); 
//		String OTP = String(numbers.charAt(rndm_method.nextInt(numbers.length())));
		
		sendMailService.send(registeration.getEmail(), "OTP", "123456");		
	}
}

