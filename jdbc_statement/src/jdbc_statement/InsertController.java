package jdbc_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertController {

	public static void main(String[] args) {
		
		try {
			
			Driver driver = new Driver();
			
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3306/statement1";
			String user ="root";
			String pass ="0786";
			
			Connection connection= DriverManager.getConnection(url, user, pass);
			
			Statement  statement= connection.createStatement();
			
			String insertQuery =  "insert into student values(1112,'Sasss','Sss@gmail.com')";
//			System.out.println(statement.execute(insertQuery));	
			boolean result=statement.execute(insertQuery);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
