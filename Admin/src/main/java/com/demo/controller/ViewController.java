package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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


//	@RequestMapping(path="vew.lti",method=RequestMethod.POST)
//	public String view(){
//		return  "login.jsp";
//		}
//	
	@RequestMapping(path="register.lti",method=RequestMethod.POST)
	public String login(@RequestParam("adminName")String adname,@RequestParam("adminPassword")String adpass)
	//public String login(AdminDetails details)
	{
		if(service.LoginValidate(adname,adpass)==true)
		{
			System.out.println("done!");
		}
		return "Administrator.jsp";
	}
	}

