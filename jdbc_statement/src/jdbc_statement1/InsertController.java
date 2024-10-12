package jdbc_statement1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertController {

	public static void main(String[] args) {
		
		Connection con= UserConnection.userGetConnection();
		
		try {
			Statement statement=con.createStatement();
			
			String insert1 ="insert into student value(6,'Nehal shaikh','Shaikh@gmail.com')";
		     System.out.println(statement.execute(insert1));
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
