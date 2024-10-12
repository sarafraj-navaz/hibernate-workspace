package com.jsp.hibernate_many_to_one_uni.service;

import com.jsp.hibernate_many_to_one_uni.dao.CarDao;
import com.jsp.hibernate_many_to_one_uni.dto.Car;

public class CarService {
	
	
	CarDao carDao = new CarDao();
	
	
	/*
	 * save method of the service class
	 */
	public Car saveCarService(Car car) {
		
		return carDao.saveCarDao(car);
	}
	
	/*
	 * GetByCarId
	 */
	public Car getByCarService(int carId) {
		
		return carDao.getByCarDao(carId);
	}
	
	/*
	 * Update CarService method
	 */
	public Car updategetByCarService(int carId,String carName) {
		
		return  carDao.updategetByCarDao(carId, carName);
	}

}
