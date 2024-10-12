package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.service;

import java.util.List;

import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dao.PatientDoctorDao;
import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Patient;

public class PatientDoctorService {
	
	PatientDoctorDao  patientDoctorDao =new PatientDoctorDao();
	
	/*
	 * SaveMethod PatientDoctor 
	 *  
	 */
	
	public List<Patient> savePatientwithDoctorService(List<Patient> patients,int doctorId){
		return patientDoctorDao.savePatientwithDoctorDao(patients, doctorId);
	}
	
	/*
	 * delete By Patient
	 */
	public void  deleteDoctorByPatientIdService(int patientId) {
		 patientDoctorDao.deleteDoctorByPatientIdDao(patientId);
	}

}
