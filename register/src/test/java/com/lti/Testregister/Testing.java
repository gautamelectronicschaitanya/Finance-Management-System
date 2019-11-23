package com.lti.Testregister;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.BankDetails;
import com.lti.entity.Registeration;
import com.lti.repository.UserDetailsRepository;

public class Testing {

	@Test
	public void addDetails(){
	ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
	UserDetailsRepository udao = ctx.getBean(UserDetailsRepository.class);  //
	Registeration reg = new Registeration();

	reg.setName("abc");
	reg.setUsername("lmn");
	reg.setPassword("xyz");
	reg.setPhone_no(1234567890);
	reg.setEmail("n@gmail.com");
	reg.setAdddress("friends colony");
	
	udao.insertUser(reg); //
	}
	



	@Test  //
	public void addBankDetails(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("app-config.xml");
		UserDetailsRepository udao = ctx.getBean(UserDetailsRepository.class);
		Registeration reg = (Registeration) udao.fetchById(Registeration.class, 507);
		BankDetails bdetails = new BankDetails();
		bdetails.setUserID(reg.getUserID());
		bdetails.setCardType("Gold");
		bdetails.setBankName("Bank of Baroda");
		bdetails.setIfscCode("BBB123456789");
		udao.insertBankDetails(bdetails);
	}
}