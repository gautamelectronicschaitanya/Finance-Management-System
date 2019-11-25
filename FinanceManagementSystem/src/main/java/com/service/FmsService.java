package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Bank_Details;
import com.entity.Card_Details;
import com.entity.Emi_Details;
import com.entity.Product_Information;
import com.entity.Product_Purchase_Information;
import com.entity.User_Profile;
import com.repository.FmsRespository;

@Service
public class FmsService {
	
	@Autowired
	FmsRespository fmsrepository;
	
	public List<User_Profile> transactionDetails(int id)
	{
		List<User_Profile> userprofile = (List<User_Profile>) fmsrepository.fetchById(User_Profile.class,102);
		
		return userprofile;
	}

}
