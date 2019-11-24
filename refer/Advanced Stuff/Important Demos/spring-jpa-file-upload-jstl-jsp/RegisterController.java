package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dto.RegisterData;
import com.lti.entity.Address;
import com.lti.entity.Customer;
import com.lti.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(path = "/register.lti", method = RequestMethod.POST)
	//public String register(HttpServletRequest request, Map model) {
	//public String register(@RequestParam("email") String email, Map model) {
	//Spring can automatically store the data coming along
	//with the request in an Object for us
	public String register(RegisterData data, Map model) {
		//code to copy the uploaded image into d:/uploads folder
		String path = "d:/uploads/";
		System.out.println(data.getName());
		System.out.println(data.getProfilePic());
		String filename = data.getName() + "-" + data.getProfilePic().getOriginalFilename(); 
		String finalpath = path + filename;
		try {
			data.getProfilePic().transferTo(new File(finalpath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		//copying data from one object to another object
		//is a tedious process. To help us in this
		//we can use something called as BeanUtils/ObjectMapper
		//to automatically copy the same
		Customer cust = new Customer();
		cust.setName(data.getName());
		cust.setEmail(data.getEmail());
		cust.setPassword(data.getPassword());
		cust.setProfilePicFileName(filename);
		
		Address addr = new Address();
		addr.setCity(data.getCity());
		addr.setPincode(data.getPincode());
		addr.setCountry(data.getCountry());
		
		cust.setAddress(addr);
		addr.setCustomer(cust);
		
		registerService.register(cust);
		

		return "confirmation.jsp";
	}
	
	@RequestMapping(path = "/fetch.lti")
	public String fetch(@RequestParam("email") String email, HttpServletRequest request, Map model) {
		Customer c = registerService.fetch(email);
		model.put("cust", c);
		//logic to retrieve the uploaded image
		String projlocation = request.getServletContext().getRealPath("/");
		File dest = new File(projlocation + "uploads");
		if(!dest.exists())
			dest.mkdir();
		
		File src = new File("d:/uploads/" + c.getProfilePicFileName());
				
		try {
			FileCopyUtils.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "profile.jsp";		
	}
	
	@RequestMapping(path = "/fetchAll.lti")
	public String fetchAll(Map model) {
		List<Customer> list = registerService.fetchAll();
		model.put("listofcust", list);
		return "profilesList.jsp";		
	}
}
