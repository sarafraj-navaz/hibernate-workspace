package com.jsp.hibernate_crud_operation0.service;

import java.util.List;

import com.jsp.hibernate_crud_operation0.dao.CollageDao;
import com.jsp.hibernate_crud_operation0.dto.Collage;

public class CollageService {
	
	CollageDao dao =new CollageDao();
	
	//save method of the collage
	public Collage saveCollageService(Collage collage) {
		if(collage.getName().length()<=10) {
			dao.saveCollageDao(collage);
			return collage;
		}
		else {
			System.out.println("collage name should not be more than 10 char");
			return null;
		}
	}
	//this is getByID it will only one row
	public Collage  getByCollageIdService(int id) {
		return dao.getByCollageIdDao(id);
	}
	//this is update method 
	public  Collage updateDaoGetByCollageIdService(int id,String name) {
		return dao.updateDaoGetByCollageId(id, name);
	}
	//this is delete method
	public Collage deleteDaogetByCollageIDService(int  id) {
		return dao.deleteDaogetByCollageID(id);
	}

	//this is display all method
	public List<Collage> displayAllDataService(){
		return dao.displayAllDataDao();
	}
}
