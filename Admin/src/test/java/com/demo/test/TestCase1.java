package com.demo.test;
import java.util.HashSet;
import java.util.Set;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.BankDetails;
import com.demo.entity.UserDetails;
import com.demo.repository.ViewRepository;

public class TestCase1 {
/*//	@Test
//	public void testView()
//	{
//		
//	   ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
//	   ViewRepository dao = ctx.getBean(ViewRepository.class);
//		BankDetails bk=(BankDetails)dao.fetchById(BankDetails.class, 454);
//	     System.out.println("detail"+bk);
//		System.out.println(bk.getACCOUNT_NO());
//		System.out.println(bk.getBANK_NAME());
//		System.out.println(bk.getCARD_TYPE());
//		System.out.println(bk.getIFSC_CODE());
//			 
//		
//		UserDetails ad = bk.getUsd();
//	
//		System.out.println(ad.getNAME());
//		 System.out.println(ad.getEMAIL());
//		 System.out.println(ad.getPASSWORD());
//		 System.out.println(ad.getPHONE_NO());
//		 
//		
//
//	   
//	}
*///	
	/*@Test
	public void testAdd()
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		   ViewRepository dao = ctx.getBean(ViewRepository.class);
		   UserDetails ad = new UserDetails();
				 ad.setUSERID(4);
				 ad.setEMAIL("some4@gmail.com");
				 ad.setNAME("some4");
				 ad.setPASSWORD("k@#@#");
				 ad.setPHONE_NO(966666335);
				
			 
			 
			 BankDetails ba=new BankDetails();
				 ba.setACCOUNT_NO(456);
				 ba.setBANK_NAME("SBI");
			 ba.setCARD_TYPE("Platinum");
			 ba.setIFSC_CODE(565545);
			 ba.setUsd(ad);
			 ad.set
			 
				 dao.add(ba);
	}*/
	
	@Test
	public void save()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("prog-config.xml");
		ViewRepository vr = ctx.getBean(ViewRepository.class);
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
		ViewRepository vr = ctx.getBean(ViewRepository.class);
		UserDetails ud = (UserDetails) vr.fetchById(UserDetails.class,315);
		
	       System.out.println(ud.getNAME());
	       System.out.println(ud.getEMAIL());
	       System.out.println(ud.getPASSWORD());
	       System.out.println(ud.getPHONE_NO());	 
	       System.out.println(vr.fetchbyPk(ud.getUSERID()));
	}

}
