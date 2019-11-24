package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.entity.AdminDetails;
import com.demo.repository.AdminRepository;
import com.demo.service.AdministratorService;

@Controller
public class ViewController {
	
	@Autowired
	AdministratorService service;
	
	@Autowired
	AdminRepository repo;


	@RequestMapping(path="register.lti",method=RequestMethod.POST)
	public String login(HttpServletRequest request)
	//public String login(AdminDetails details)
	{
		String adminname=request.getParameter("adminName");
		String adminpass=request.getParameter("adminPassword");
		System.out.println(adminname);
		System.out.println(adminpass);
		boolean ans = service.LoginValidate(adminname,adminpass);
		System.out.println(ans);
		if(ans==true)
		{
	    return "Administrator.jsp";
		}
		else
		{
			return "Fail.jsp";
		}
		
	}
	}

