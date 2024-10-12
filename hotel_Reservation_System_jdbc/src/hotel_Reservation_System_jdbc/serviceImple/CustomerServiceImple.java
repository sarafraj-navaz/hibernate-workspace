package hotel_Reservation_System_jdbc.serviceImple;

import hotel_Reservation_System_jdbc.daoImple.CustomerDaoImple;
import hotel_Reservation_System_jdbc.dto.Customer;
import hotel_Reservation_System_jdbc.service.CustomerService;

public class CustomerServiceImple implements CustomerService{
	
	CustomerDaoImple dao =new CustomerDaoImple();

	@Override
	public Customer saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}

	@Override
	public Customer viewReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getRevervationRoom(Customer customer, String number, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteReversionById(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReservation(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getOnePersionDetail(String number) {
		// TODO Auto-generated method stub
		return null;
	}

}
