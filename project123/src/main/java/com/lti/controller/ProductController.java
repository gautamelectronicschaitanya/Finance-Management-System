package com.lti.controller;

import javax.servlet.http.HttpServletRequest;

import com.lti.entity.ProductInformation;
import com.lti.repository.ProductRepository;
import com.lti.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService prodservice;
	
	@Autowired
	private ProductRepository prodrepo;
	
	@RequestMapping(path="addProduct.lti",method=RequestMethod.POST)
	public String addProduct(HttpServletRequest request)
	{
		ProductInformation prodinfo = new ProductInformation();
		prodinfo.setProductId(1);
		prodinfo.setProductName("speakers");
		prodinfo.setProductInfo("aa");
		prodinfo.setProductAmount(6500);
		prodinfo.setProductImage("speakers1.jpg");
		
		prodservice.addProduct(prodinfo);
		return "addProduct.jsp";
	}

}
