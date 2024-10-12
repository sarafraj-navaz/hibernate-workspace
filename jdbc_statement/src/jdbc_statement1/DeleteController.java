package jdbc_statement1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteController {

	public static void main(String[] args) {
		
		Connection con =UserConnection.userGetConnection();
		
		try {
			Statement statement =con.createStatement();
			
			String delete ="delete from student where studentId=2";
			 int check=statement.executeUpdate(delete);
			 if(check ==1) {
				 System.out.println("data has been deleted Successfully");
			 }
			 else {
				 System.out.println("please check your given Id");
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
