package com.jsp.hibernate_one_to_one.service;

import java.util.List;

import com.jsp.hibernate_one_to_one.dao.PersonAdharDao;
import com.jsp.hibernate_one_to_one.dto.Adhar;
import com.jsp.hibernate_one_to_one.dto.Person;

public class PersonAdharService {
	
	PersonAdharDao dao =new PersonAdharDao();
	
	  public Person savePersonAdharService(Person person,Adhar adhar) {
		  
		return  dao.savePersonAdharDao(person, adhar);
	  }
	  
	  /**
	   * Find method of the entity manager of the hibernate
	   */
	  
	  public Person getByPersonAdharService(int personId) {
		  
		  return dao.getByPersonAdharDao(personId);
	  }
	  
	  /**
	   * detete method
	   */
	  public void deletePersonAdharGetByIdService(int  personId) {
		  
		  dao.deletePersonAdharGetByIdDao(personId);
	  }
	  /**
	   * 
	   * @param personName
	   * @param personId
	   * @return
	   * update method
	   */
	  public Person updatePersonAdharBygetIdService(String personName,int personId) {
		  
		return  dao.updatePersonAdharBygetIdDao(personName, personId);
		  
	  }
	  
	  
	  /**
	   * displayAll data from the table
	   */
	  public List<Person> displayAllService(){
		  
		  return dao.displayAllDao();
	  }

}
