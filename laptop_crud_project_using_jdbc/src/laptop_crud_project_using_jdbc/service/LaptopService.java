package laptop_crud_project_using_jdbc.service;

import java.util.List;

import laptop_crud_project_using_jdbc.dto.Laptop;

public interface LaptopService {
	/*
	 * save or insert method 1
	 */
	public Laptop saveLaptopService(Laptop laptop);

	/*
	 * getByLaptopId 2
	 */
	public Laptop getByLaptopidService(int id);

	/*
	 * display all 3
	 */
	public List<Laptop> getDisplayAllDao();

	/*
	 * delete method by Laptopid 4
	 * 
	 */
	public int deleteByLaptopIdService(int id);

	/*
	 * getbyLaptopID to check  5
	 */
	public int getbyLaptopIdDaoTOCheckService(int id);

	/*
	 * 
	 * update method by getByLaptopId; 6
	 */
	public int updateAllByLaptopIdDao(Laptop laptop, int id);
}
