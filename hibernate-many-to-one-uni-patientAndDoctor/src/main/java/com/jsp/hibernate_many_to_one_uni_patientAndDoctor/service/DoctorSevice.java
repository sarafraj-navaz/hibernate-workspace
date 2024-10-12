package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.service;

import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dao.DoctorDao;
import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Doctor;

public class DoctorSevice {
	
	
	DoctorDao doctorDao =new DoctorDao();
	
	/*
	 *SaveDoctorOnly 
	 */
	public Doctor saveDoctorService(Doctor doctor) {
		return doctorDao.saveDoctorDao(doctor);
	}
	
	
	/*
	 * delete Method  for Doctor 
	 */
	public void deleteDoctorService(int doctorId) {
		doctorDao.deleteDoctorDao(doctorId);
	}

}
