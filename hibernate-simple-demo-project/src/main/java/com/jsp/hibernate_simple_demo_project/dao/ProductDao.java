package com.jsp.hibernate_simple_demo_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_demo_project.dto.Product;

public class ProductDao {
	
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	
	/*
	 * save Product Dao
	 */
	public Product saveProductDao(Product product) {
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;

	}
	
	
	/*
	 * delete ProductDao from product
	 */
	public boolean deleteProductByIdDao(int productId) {
		
		Product product =getByIdDao(productId);
		
		if(product !=  null) {
			
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * update ProductDao method
	 */
	
	public Product updateProductNameByIDao(int productId,String productName) {
		
		Product product =getByIdDao(productId);
		
		if(product != null) {
			product.setProductName(productName);
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			
			return product;
		}
		else {
			return product;
		}
	}
	/*
	 * getByProductIdDao 
	 */
	
	public Product getByIdDao(int productId) {
		
		return entityManager.find(Product.class,productId);
	}
	/*
	 * Display All  ProductDao
	 */
	public List<Product> displayAllDao(){
		
		String displayQuery ="From Product";
		
		Query query = entityManager.createQuery(displayQuery);
		
		return query.getResultList();
		
		
		
	}
}
