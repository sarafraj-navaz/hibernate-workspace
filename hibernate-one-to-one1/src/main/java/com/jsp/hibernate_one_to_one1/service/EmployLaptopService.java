package com.jsp.hibernate_one_to_one1.service;

import com.jsp.hibernate_one_to_one1.dao.EmployLaptopDao;
import com.jsp.hibernate_one_to_one1.dto.Employ;

public class EmployLaptopService {
	
	EmployLaptopDao dao = new EmployLaptopDao();
	
	//Save Method
	public Employ saveEmployPersonService(Employ employ) {
	
		return dao.saveEmployPersonDao(employ);
	}
	
	//get by Id method
	public Employ getByEmployIdService(int employId) {
		return dao.getByEmployIdDao(employId);
	}

}
