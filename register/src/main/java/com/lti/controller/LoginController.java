package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Registeration;
import com.lti.repository.UserDetailsRepository;
import com.lti.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	Registeration registeration = new Registeration();
	
	@RequestMapping(path="login.lti", method=RequestMethod.POST)
	public String login(Registeration registeration, @RequestParam("username") String username, @RequestParam("password") String password){
		System.out.println("in login controller--login()");
	
		boolean flag = loginservice.login(registeration);
		
		if(flag == true)
		return "Dashboard.jsp";
		else
		return "error.jsp";
	}
}
