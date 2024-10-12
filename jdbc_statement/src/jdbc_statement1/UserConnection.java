package jdbc_statement1;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;


public class UserConnection {
	
	public static Connection userGetConnection() {
		
		try {
			Driver driver =new Driver();
			
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3306/statement1";
			String user ="root";
			String pass="0786";
			
		 return	DriverManager.getConnection(url, user, pass);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
