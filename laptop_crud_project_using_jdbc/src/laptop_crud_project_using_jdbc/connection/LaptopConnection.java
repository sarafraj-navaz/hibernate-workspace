package laptop_crud_project_using_jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class LaptopConnection {
	
	public static Connection getLaptopConnection() {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			String url="jdbc:mysql://localhost:3306/navaz";
			String user="root";
			String pass ="0786";
			
			return DriverManager.getConnection(url, user, pass);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	return null;	
	}

}
