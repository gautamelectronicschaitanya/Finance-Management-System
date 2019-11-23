package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.BankDetails;
import com.lti.repository.EMIRepository;

@Service
public class EMIService {

	
	@Autowired
	private EMIRepository emirepository;
	
	public void display(EMIDetails emidetails){
		EMIDetails emi =(EMIDetails) EMIRepository.fetchbyId();

	}
}
