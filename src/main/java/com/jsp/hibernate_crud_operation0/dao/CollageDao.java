package com.jsp.hibernate_crud_operation0.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_crud_operation0.dto.Collage;
/**
 * 
 * @author Navaz
 *
 */
public class CollageDao {
	/*
	 * EntityManagerFactory
	 * entityManagerFactory=Persistence.createEntityManagerFactory("hibernate");
	 * EntityManager entityManager =entityManagerFactory.createEntityManager();
	 */
	EntityManager entityManager =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	/*
	 * this is save method which will accept Collage type data;
	 */
	public Collage saveCollageDao(Collage collage) {
		entityTransaction.begin();
		entityManager.persist(collage);
		entityTransaction.commit();
		
		return collage;
	}
	//this is getByID it will only one row
	public Collage  getByCollageIdDao(int id) {
		return entityManager.find(Collage.class, id);
	}
	//this is update method 
	public  Collage updateDaoGetByCollageId(int id,String name) {
	    Collage collage= getByCollageIdDao(id);
	    if(collage != null) {
	    	collage.setName(name);
	    	entityTransaction.begin();
	    	entityManager.merge(collage);
	    	entityTransaction.commit();
	    	
	    	return collage;
	    }
	    return null;
	}
	
	//this is delete method
	public Collage deleteDaogetByCollageID(int  id) {
	 Collage collage= getByCollageIdDao(id);
	 if(collage  != null) {
		 entityTransaction.begin();
		 entityManager.remove(collage);
		 entityTransaction.commit();
		 
		 return collage;
	 }
	 return null;
	}
	
	//this is display all method
	public List<Collage> displayAllDataDao(){
		String displayQuery ="FROM Collage";
		Query query= entityManager.createQuery(displayQuery);
		return query.getResultList();
	}
}
