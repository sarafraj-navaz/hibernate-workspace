package jdbc_student_crud_operation_by_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class StudentConnection {
	
	public static Connection getStudentConnection() {
		
		try {
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			
			
			String url ="jdbc:mysql://localhost:3306/statement1";
			String user ="root";
			String pass ="0786";
					
			return DriverManager.getConnection(url, user, pass);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
