package com.jsp.hibernate_one_to_many_university_collage_uni.service;

import com.jsp.hibernate_one_to_many_university_collage_uni.dao.CollageDao;
import com.jsp.hibernate_one_to_many_university_collage_uni.dto.Collage;

public class CollageService {
	
	CollageDao collageDao = new CollageDao();
	
	public Collage saveMethodDao(Collage collage) {
		return collageDao.saveMethodDao(collage);
	}
	
	/*
	 * 
	 * delete  collage by Id
	 */
	public void deleteCollgeByCollageIdService(int collageId) {
		collageDao.deleteCollgeByCollageIdDao(collageId);
	}
	
	/*
	 * delete  collage by Id
	 */

}
