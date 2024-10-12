package laptop_crud_project_using_jdbc.dao;

import java.sql.Statement;
import java.util.List;

import laptop_crud_project_using_jdbc.dto.Laptop;

public interface LaptopDao {

	/*
	 * save or insert method or sign up method
	 */
	public Laptop saveLaptopDao(Laptop laptop);

	/*
	 * getByLaptopId
	 */
	public Laptop getByLaptopidDao(int id);

	/*
	 * display all
	 */
	public List<Laptop> getDisplayAllDao();

	/*
	 * delete method by Laptopid
	 * 
	 */
	public int deleteByLaptopIdDao(int id);

	/*
	 * getbyLaptopID to check 
	 */
	public int getbyLaptopIdDaoTOCheck(int id);

	/*
	 * 
	 * update method by getByLaptopId;
	 */
	public int updateAllByLaptopIdDao(Laptop laptop, int id);
}
