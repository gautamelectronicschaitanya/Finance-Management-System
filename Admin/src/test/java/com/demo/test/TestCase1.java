package com.demo.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.AdminDetails;
import com.demo.entity.AuthDetails;
//import com.demo.entity.AuthenticateAccount;
import com.demo.entity.BankDetails;
import com.demo.entity.UserDetails;
import com.demo.repository.AdminRepository;

public class TestCase1 {	
	@Test
	public void save()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository vr = ctx.getBean(AdminRepository.class);
		UserDetails ud = new UserDetails();
		BankDetails bk = new BankDetails();
		bk.setBANK_NAME("SBI");
		bk.setCARD_TYPE("GOLD");
		bk.setIFSC_CODE(556);
		ud.setNAME("Arjun");
		ud.setUSERID(104);
		ud.setEMAIL("Ar@k2.com");
		ud.setPASSWORD("qwerty");
		ud.setPHONE_NO(2451);
		bk.setUsd(ud);
		Set<BankDetails> bankd = new HashSet<BankDetails>();
		bankd.add(bk);
		ud.setDetails(bankd);
		vr.add(ud);
	}
	
	@Test
	public void view()
	{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository vr = ctx.getBean(AdminRepository.class);
		UserDetails ud = (UserDetails) vr.fetchById(UserDetails.class,105);
		
	       System.out.println(ud.getNAME());
	       System.out.println(ud.getEMAIL());
	       System.out.println(ud.getPASSWORD());
	       System.out.println(ud.getPHONE_NO());	 
	       System.out.println(vr.fetchbyPk(ud.getUSERID()));
	}
	@Test
	public void addAdmin()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AdminDetails ad = new AdminDetails();
		ad.setAdminId(101);
		ad.setAdminName("LTI");
		ad.setAdminPassword("admin@123");
		ar.add(ad);
	}
	
	@Test
	public void viewAdmin()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AdminDetails ad = (AdminDetails) ar.fetchById(AdminDetails.class,101);
		System.out.println(ad.getAdminName());
		System.out.println(ad.getAdminPassword());
		
	}
	
	@Test
	public void viewAdmin2()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AdminDetails ad =(AdminDetails) ar.fetchAll();
		if(ad.getAdminPassword().equals("admin@123"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(ad.getAdminName().equals("LTI"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	@Test
	public void UserDetailsView()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
	   ArrayList<UserDetails> uds = (ArrayList<UserDetails>)ar.FectAllUserDetails();
        for(UserDetails ud:uds)
	    {
	    	System.out.println(ud.getNAME());
	    	System.out.println(ud.getEMAIL());
	    }
	}
	
	@Test
	public void Auth()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AuthDetails ad = new AuthDetails();
		ad.setId(10);
		ad.setStatus("ACTIVE");
		ar.add(ad);	
	}
	
	@Test
	public void TestAuth()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AuthDetails ad = (AuthDetails)ar.fetchById(AuthDetails.class,10);
		System.out.println(ad.getStatus());
		
	}
	
	@Test
	public void TestAuth2()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository ar = ctx.getBean(AdminRepository.class);
		AuthDetails ad = (AuthDetails)ar.fetchById(AuthDetails.class,10);
		ad.setStatus("fail");
		ar.add(ad);
		
	}
	
	@Test
	public void NewAdd()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		AdminRepository vr = ctx.getBean(AdminRepository.class);
		UserDetails ud = new UserDetails();
		BankDetails bk = new BankDetails();
		AuthDetails ad = new AuthDetails();
		bk.setBANK_NAME("SBI");
		bk.setCARD_TYPE("GOLD");
		bk.setIFSC_CODE(5565);
		ud.setNAME("popo");
		ud.setUSERID(109);
		ud.setEMAIL("Ar@k2.com");
		ud.setPASSWORD("qwerty");
		ud.setPHONE_NO(2451530);
		ad.setUserDetails(ud);
		ad.setId(101);
		ad.setStatus("Active");
		bk.setUsd(ud);
		Set<BankDetails> bankd = new HashSet<BankDetails>();
		bankd.add(bk);
		ud.setDetails(bankd);
		vr.add(ud);
		vr.add(ad);
	}
	
	

}
