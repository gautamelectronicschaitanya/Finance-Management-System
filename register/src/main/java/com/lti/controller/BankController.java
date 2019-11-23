package com.lti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.BankDetails;
import com.lti.entity.Registeration;
import com.lti.service.BankService;

@Controller
@SessionAttributes("registeration")
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@RequestMapping(path="bankDetails.lti", method=RequestMethod.POST)
	public String registerbank(BankDetails bankDetails,ModelMap model){
		
		Registeration reg = (Registeration) model.get("registeration");
		
		bankDetails.setRegisteration(reg);
		
		
		bankService.registerBank(bankDetails);
	
		return "login.jsp";
	}
}
