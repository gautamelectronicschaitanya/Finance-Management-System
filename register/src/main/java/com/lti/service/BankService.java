package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.BankDetails;
import com.lti.repository.UserDetailsRepository;

@Service
public class BankService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	public void registerBank(BankDetails bankDetails){
		BankDetails bankd =(BankDetails) userDetailsRepository.insertBankDetails(bankDetails);
		bankDetails.setRegisteration((bankd.getRegisteration()));
	
	
	}
}
