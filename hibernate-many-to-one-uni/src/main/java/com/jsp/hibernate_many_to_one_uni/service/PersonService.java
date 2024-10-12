package com.jsp.hibernate_many_to_one_uni.service;

import com.jsp.hibernate_many_to_one_uni.dao.PersonCarDao;
import com.jsp.hibernate_many_to_one_uni.dao.PersonDao;
import com.jsp.hibernate_many_to_one_uni.dto.Person;

public class PersonService {
	
	PersonDao dao = new PersonDao();
	
	/*
	 * Person Dao
	 */
	public Person savePersonService(Person person) {
		
	  return	dao.savePersonDao(person);
	}
	

}
