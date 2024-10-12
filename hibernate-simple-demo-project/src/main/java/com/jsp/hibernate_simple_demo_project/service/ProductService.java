package com.jsp.hibernate_simple_demo_project.service;

import java.util.List;

import com.jsp.hibernate_simple_demo_project.dao.ProductDao;
import com.jsp.hibernate_simple_demo_project.dto.Product;

public class ProductService {
	
	
	ProductDao dao = new ProductDao();
	
	/*
	 * save Product Dao
	 */
	public Product saveProductService(Product product) {
		
		return dao.saveProductDao(product);
	}

	
	//Get By Id from ProductDao
	
	public Product getByIdService(int productId) {
		
		return dao.getByIdDao(productId);
	}
	
	/*
	 * delete ProductDao from product
	 */
	public boolean deleteProductByIdService(int productId) {
		
		return dao.deleteProductByIdDao(productId);
	}
	/*
	 * update ProductService method
	 */
	
	public Product updateProductNameByIService(int productId,String productName) {
		
		return dao.updateProductNameByIDao(productId, productName);
	}
	/*
	 * Display All  ProductDao
	 */
	public List<Product> displayAllDao(){
		
		return dao.displayAllDao();
	}
}
