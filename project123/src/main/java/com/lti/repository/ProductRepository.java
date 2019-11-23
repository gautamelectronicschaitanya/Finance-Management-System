package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.lti.entity.ProductInformation;


@Repository
public class ProductRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<ProductInformation> getAllProducts()  {
		Query qry1= entityManager.createQuery("select p from PRODUCT_INFORMATION p ");
		List<ProductInformation> productList = qry1.getResultList();
		return productList;
	}
	
	public int insertNewProduct(ProductInformation prodinfo)  {
		
		entityManager.persist(prodinfo);
	
		return 1;
	}
}
