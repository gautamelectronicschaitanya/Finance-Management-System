package com.demo.test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.BankDetails;
import com.demo.entity.UserDetails;
import com.demo.repository.AdministratorRepository;

public class TestCase1 {
	@Test
	public void testView()
	{
		
	   ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
	   AdministratorRepository dao = ctx.getBean(AdministratorRepository.class);
	   UserDetails ad = (UserDetails)dao.fetchById(UserDetails.class,1);
       
			 System.out.println(ad.getNAME());
			 System.out.println(ad.getEMAIL());
			 System.out.println(ad.getPASSWORD());
			 System.out.println(ad.getPHONE_NO());
			 System.out.println(ad.getUSERID());

	   
	}

}
