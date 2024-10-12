package com.jsp.hibernate_one_to_many_university_collage_uni.service;

import java.util.List;

import com.jsp.hibernate_one_to_many_university_collage_uni.dao.UniversityCollageDao;
import com.jsp.hibernate_one_to_many_university_collage_uni.dto.Collage;
import com.jsp.hibernate_one_to_many_university_collage_uni.dto.University;

public class UniversityCollageService {

	UniversityCollageDao universityCollageDao = new UniversityCollageDao();

	/*
	 * save method
	 */
	public University saveUniversityCollage(University university, List<Collage> collages) {
		return universityCollageDao.saveUniversityCollage(university, collages);
	}

	/*
	 * add merger and more collage in the university
	 */
	public University mergeCollageWithUniversityService(int collageId, int universityId) {
		return universityCollageDao.mergeCollageWithUniversityDao(collageId, universityId);
	}

	/* we will fix above bucks error */

	public University mergeCollageWithUniversityDaoFixBuck(int collageId, int universityId) {
		return universityCollageDao.mergeCollageWithUniversityDaoFixBuck(collageId, universityId);
	}

	/*
	 * ByUniversityID we are getting all Collage Details
	 */
	public University getAllCollageDetailsWithUniversityIdService(int universityId) {
		return universityCollageDao.getAllCollageDetailsWithUniversityIdDao(universityId);
	}

}
