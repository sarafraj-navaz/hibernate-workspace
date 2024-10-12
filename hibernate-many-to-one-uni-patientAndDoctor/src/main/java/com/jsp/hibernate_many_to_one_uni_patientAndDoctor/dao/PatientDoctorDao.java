package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Doctor;
import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Patient;

public class PatientDoctorDao {
	

	
	EntityManager entityManager =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	/*
	 * SaveMethod PatientDoctor 
	 *  
	 */
	
	public List<Patient> savePatientwithDoctorDao(List<Patient> patients,int doctorId){
		
		
		Doctor doctor= entityManager.find(Doctor.class, doctorId);
		
		if(doctor != null) {
			entityTransaction.begin();
			
			
			for (Patient patient : patients) {
				patient.setDoctor(doctor);
				entityManager.persist(patient);
			}
			entityTransaction.commit();
		}
		
		
	return patients;
	}

	/*
	 * delete By Patient
	 */
	public void  deleteDoctorByPatientIdDao(int patientId) {
		Patient patient= entityManager.find(Patient.class, patientId);
		
		if(patient != null) {
			Doctor doctor= patient.getDoctor();
			entityTransaction.begin();
			entityManager.remove(doctor);
			entityTransaction.commit();
		}
		
	
	}

}
