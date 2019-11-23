package com.lti.service;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.lti.entity.ProductInformation;
import com.lti.repository.ProductRepository;



public class ProductService {
	
	@PersistenceContext
	private ProductRepository prodrepo;
	
	public List<ProductInformation> showAllProduct(){
		return prodrepo.getAllProducts();
	}
	
	public boolean addProduct(ProductInformation product){
		int result =prodrepo.insertNewProduct(product);
		if(result==1)
		{
			return true;
		}
		else {
		return false;
		}
	
}
}
