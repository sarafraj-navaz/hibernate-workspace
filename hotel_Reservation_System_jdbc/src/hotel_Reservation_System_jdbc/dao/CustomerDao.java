package hotel_Reservation_System_jdbc.dao;

import hotel_Reservation_System_jdbc.dto.Customer;

public interface CustomerDao {
	
	public Customer saveCustomer(Customer customer);
	public Customer  viewReservation();
	public Customer   getRevervationRoom(Customer customer,String number,String email);
	public int deleteReversionById(int customerId);
	public int updateReservation(int customerId);
	public Customer getOnePersionDetail(String number);

}
