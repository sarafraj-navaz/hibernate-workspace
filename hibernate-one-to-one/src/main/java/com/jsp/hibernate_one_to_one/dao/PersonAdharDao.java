package com.jsp.hibernate_one_to_one.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_one.dto.Adhar;
import com.jsp.hibernate_one_to_one.dto.Person;

public class PersonAdharDao { 
	
	  
	  EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernate");
	  EntityManager entityManager= entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction= entityManager.getTransaction();
	  
	  /*
	   * 
	   * save Dao method or insert method
	   */
	
  public Person savePersonAdharDao(Person person,Adhar adhar) {
	  

	  
	  entityTransaction.begin();
	  entityManager.persist(adhar);
		/* person.setAdhar(adhar); */
	  entityManager.persist(person);
	  entityTransaction.commit();
	  
	  return person;
  }

  
  /**
   * Find method of the entity manager of the hibernate
   */
  
  public Person getByPersonAdharDao(int personId) {
	  
	  return entityManager.find(Person.class, personId);
  }
  
  /**
   * detete method
   */
  public void deletePersonAdharGetByIdDao(int  personId) {
	  
	  Person tableId =getByPersonAdharDao(personId);
	  
	  if(tableId != null) {
		  
		  entityTransaction.begin();
		  entityManager.remove(tableId);
		  entityTransaction.commit();
	  }
	  else {
		  System.out.println("your given Id is Not persent  in the Table");
	  }
  }
  /**
   * 
   * @param personName
   * @param personId
   * @return
   * update method
   */
  public Person updatePersonAdharBygetIdDao(String personName,int personId) {
	  
	  Person tableId =getByPersonAdharDao(personId);
	  
	  if(tableId != null) {
		  tableId.setEmail(personName);
		  
		  entityTransaction.begin();
		  entityManager.merge(tableId);
		  entityTransaction.commit();
		  
		return tableId; 
	  }
	return null;

  }
  
  /**
   * displayAll data from the table
   */
  public List<Person> displayAllDao(){
	  
	  String displayQuery ="from Person";
	  
	  Query query= entityManager.createQuery(displayQuery);
	  
	  return query.getResultList();
	  
  }
}
