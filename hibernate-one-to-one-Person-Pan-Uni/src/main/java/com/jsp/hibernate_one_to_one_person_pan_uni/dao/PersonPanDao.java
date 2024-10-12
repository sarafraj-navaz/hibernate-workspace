package com.jsp.hibernate_one_to_one_person_pan_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one_person_pan_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_person_pan_uni.dto.Person;

public class PersonPanDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	//save method
	public Person savePersonPanDao(Person person,Pan pan) {
		//person.setPan(pan);
		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}
	/*
	 * getPanPersonByPersonIdDao
	 */
	public Person getPanPersonByPersonIdDao(int personId) {
		return entityManager.find(Person.class, personId);
	}
	
	/*
	 * deleteMethod Of dao class
	 * 
	 */
	public void deletePanPersonByPersonIdDao(int personId) {
		Person person= getPanPersonByPersonIdDao(personId);
		
		if(person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		
		}	
	}
	/*
	 * update 
	 */
    public Person updatePanPersonByPersonIdDao(int personId,String address) {
    	Person person= entityManager.find(Person.class, personId);
    	
    	if(person != null) {
    		Pan pan= person.getPan();
    		pan.setAddress(address);
    		entityTransaction.begin();
    		entityManager.merge(pan);
    		entityTransaction.commit();
    		
    		return person;
    	}
    	else {
    		return null;
    	}
    }
    /*
     * display
     */
    public List<Person> displayAll(){
    	return entityManager.createQuery("from Person").getResultList();
    }
}
