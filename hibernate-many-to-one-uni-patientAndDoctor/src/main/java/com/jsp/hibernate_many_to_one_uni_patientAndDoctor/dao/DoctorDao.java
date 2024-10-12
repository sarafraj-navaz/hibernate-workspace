package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Doctor;

public class DoctorDao {
	
	EntityManager entityManager =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	
	/*
	 *SaveDoctorOnly 
	 */
	public Doctor saveDoctorDao(Doctor doctor) {
		
		
		entityTransaction.begin();
		entityManager.persist(doctor);
		entityTransaction.commit();
		
		return doctor;
	}
	/*
	 * delete Method  for Doctor 
	 */
	public void deleteDoctorDao(int doctorId) {
		Doctor doctor = entityManager.find(Doctor.class, doctorId);
		if(doctor  != null) {
			entityTransaction.begin();
			entityManager.remove(doctor);
			entityTransaction.commit();
		}
	}

}
