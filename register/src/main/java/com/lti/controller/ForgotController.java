package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Registeration;
import com.lti.service.ForgotService;

@Controller
public class ForgotController {

	private ForgotService forgotService;
	
	@RequestMapping(path="/forgotPassword.jsp",method=RequestMethod.POST)
	public String forgotPassword(Registeration registeration, @RequestParam("email") String email){
		forgotService.forgot(registeration);
		return "changePassword.jsp";
	}


}
