package hotel_Reservation_System_jdbc.daoImple;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import hotel_Reservation_System_jdbc.connection.CustomerConnection;
import hotel_Reservation_System_jdbc.dao.CustomerDao;
import hotel_Reservation_System_jdbc.dto.Customer;

public class CustomerDaoImple implements CustomerDao{

	Connection con=CustomerConnection.getCustomerConnection();
	@Override
	public Customer saveCustomer(Customer customer) {
		
		try {
			Statement state=con.createStatement();
			
			String insertQuery="insert into customer(customerFullName,customerEmail,customerNumber,customerRoomNumber,customerAddress,customerByGivenMoney) values('"+customer.getFName()+" "+customer.getLName()+"','"+customer.getEmail()+"','"+customer.getPhone()+"',"+customer.getAge()+","+customer.getRoomNumber()+",'"+customer.getAddress()+"',"+customer.getCByGiverMoney()+")";
			state.execute(insertQuery);
			
			return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
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
