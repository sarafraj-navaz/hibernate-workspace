package com.jsp.hibernate_one_to_many_university_collage_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_many_university_collage_uni.dto.Collage;

public class CollageDao {
	
	EntityManager entityManager=Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Collage saveMethodDao(Collage collage) {
		entityTransaction.begin();
		entityManager.persist(collage);
		entityTransaction.commit();
		
		return collage;
	}
	/*
	 * delete  collage by Id
	 */
	public void deleteCollgeByCollageIdDao(int collageId) {
		
		 Collage  collage=entityManager.find(Collage.class, collageId);
		 
		 String deleteQuery ="delete from university_collage where collages_collageId=?";
		 if(collage != null) {
			 
			Query query =entityManager.createNativeQuery(deleteQuery);
			 query.setParameter(1, collageId);
			 
			 entityTransaction.begin();
			 query.executeUpdate();
			 entityManager.remove(collage);
			 entityTransaction.commit();
		 }
		
	}

}
