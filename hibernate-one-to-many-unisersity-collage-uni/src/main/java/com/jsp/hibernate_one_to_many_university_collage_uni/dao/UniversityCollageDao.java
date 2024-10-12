package com.jsp.hibernate_one_to_many_university_collage_uni.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_many_university_collage_uni.dto.Collage;
import com.jsp.hibernate_one_to_many_university_collage_uni.dto.University;

/**
 * 
 * @author Sarafarj
 *
 */
public class UniversityCollageDao {
	EntityManager entityManager = Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	/*
	 * save Collage with university
	 */
	public University saveUniversityCollage(University university, List<Collage> collages) {

		entityTransaction.begin();
		for (Collage collage : collages) {
			entityManager.persist(collage);
		}
		entityManager.persist(university);
		entityTransaction.commit();
		return university;
	}

	/*
	 * add merger and more collage in the university
	 */
	public University mergeCollageWithUniversityDao(int collageId, int universityId) {
		Collage collage = entityManager.find(Collage.class, collageId);
		University university = entityManager.find(University.class, universityId);

		List<Collage> collages = new ArrayList<Collage>(Arrays.asList(collage));

		university.setCollages(collages);

		entityTransaction.begin();
		entityManager.merge(university);
		entityTransaction.commit();

		return university;

	}

	/* we will fix above bucks error */

	public University mergeCollageWithUniversityDaoFixBuck(int collageId, int universityId) {

		University university = entityManager.find(University.class, universityId);

		String insertQuery = "insert into university_collage(University_universityId,collages_collageId) values(?,?)";

		Query query = entityManager.createNativeQuery(insertQuery);

		query.setParameter(1, universityId);
		query.setParameter(2, collageId);

		entityTransaction.begin();
		query.executeUpdate();
		entityTransaction.commit();

		return university;
	}

	/*
	 * ByUniversityID we are getting all Collage Details
	 */
	public University getAllCollageDetailsWithUniversityIdDao(int universityId) {
		University university = entityManager.find(University.class, universityId);
		return university;
	}

	/*
	 * By this method we can update Collage name
	 * 
	 * public University updateCollageNameWithUniversityId(int universityId,int
	 * collageId,String collageName) { University university=
	 * entityManager.find(University.class,universityId);
	 * 
	 * List<Collage> collages=university.getCollages();
	 * 
	 * if(university != null) { for (Collage collage : collages) {
	 * if(collage.getCollageId()==collageId) { collage.setCollageName(collageName);
	 * } } } }
	 */
	

}
