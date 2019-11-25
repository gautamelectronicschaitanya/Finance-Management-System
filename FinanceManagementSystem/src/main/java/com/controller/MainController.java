package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Emi_Details;
import com.entity.User_Profile;
import com.service.FmsService;

@Controller
public class MainController {

	
@Autowired
FmsService service;
	@RequestMapping("/buy")
	public String tx() {
		return "transaction.jsp";
	}

	@RequestMapping("/conformation")
	public String conf() {
		return "conformation.jsp";
	}

	@RequestMapping("/dashboard")
	public String view(Model m) {
		List<User_Profile> list = service.transactionDetails(101); 
		m.addAttribute("list", list);
		return "dashboard.jsp";
	}

}
