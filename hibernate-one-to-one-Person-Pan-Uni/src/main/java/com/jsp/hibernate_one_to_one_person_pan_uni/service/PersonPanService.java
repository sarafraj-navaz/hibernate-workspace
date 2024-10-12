package com.jsp.hibernate_one_to_one_person_pan_uni.service;

import java.util.List;

import com.jsp.hibernate_one_to_one_person_pan_uni.dao.PersonPanDao;
import com.jsp.hibernate_one_to_one_person_pan_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_person_pan_uni.dto.Person;

public class PersonPanService {
	PersonPanDao dao=new PersonPanDao();
	
	//save method
	public Person savePersonPanService(Person person,Pan pan) {
         return dao.savePersonPanDao(person, pan);
	}

	//get by Id method 
		public Person getPanPersonByPersonIdService(int personId) {
			return dao.getPanPersonByPersonIdDao(personId);
		}
		/*
		 * delete method of service class
		 */
		public void deletePanPersonByPersonIdService(int personId) {
			dao.deletePanPersonByPersonIdDao(personId);
		}
		/*
		 * update 
		 */
	    public Person updatePanPersonByPersonIdDao(int personId,String address) {
	    	return dao.updatePanPersonByPersonIdDao(personId, address);
	    }
	    /*
	     * display
	     */
	    public List<Person> displayAllService(){
	    	return dao.displayAll();
	    }
}
