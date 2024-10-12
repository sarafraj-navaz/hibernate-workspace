package laptop_crud_project_using_jdbc.serviceImple;

import java.util.List;

import laptop_crud_project_using_jdbc.daoImple.LaptopDaoImple;
import laptop_crud_project_using_jdbc.dto.Laptop;
import laptop_crud_project_using_jdbc.service.LaptopService;

public class LaptopServiceImplement implements LaptopService {

	LaptopDaoImple dao = new LaptopDaoImple();

	public Laptop saveLaptopService(Laptop laptop) {
		return dao.saveLaptopDao(laptop);
	}

	public Laptop getByLaptopidService(int id) {
		return dao.getByLaptopidDao(id);
	}

	public List<Laptop> getDisplayAllDao() {
		return dao.getDisplayAllDao();
	}

	public int deleteByLaptopIdService(int id) {
		return dao.deleteByLaptopIdDao(id);
	}

	public int getbyLaptopIdDaoTOCheckService(int id) {
		return dao.getbyLaptopIdDaoTOCheck(id);
	}

	public int updateAllByLaptopIdDao(Laptop laptop, int id) {
		return dao.updateAllByLaptopIdDao(laptop, id);
	}
}
