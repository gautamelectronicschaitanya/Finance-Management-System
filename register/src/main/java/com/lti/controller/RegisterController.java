package com.lti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.entity.Registeration;
import com.lti.service.RegisterationService;

@Controller
@SessionAttributes("registeration")
public class RegisterController {

	@Autowired
	
	private RegisterationService registerationService;
	
	
	@RequestMapping(path="registeration.lti", method=RequestMethod.POST)
	public String register(Registeration reg,HttpSession session, ModelMap model){
		registerationService.register(reg);
		model.put("registeration", reg);
		return "bankDetails.jsp";
	}
}
