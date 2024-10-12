package java_jdbc_home1.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class UserConnection {

	public static Connection getConnection() {
		try {
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3306/raj1";
			String user ="root";
			String pass ="0786";
			
		return	DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;	
	}
}
