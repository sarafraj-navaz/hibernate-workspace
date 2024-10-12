package jdbc_All_program0.insertAll_in_one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertController {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/jdbc-insertcontroller";
			String user ="root";
			String pass ="0786";
			
			Connection connection= DriverManager.getConnection(url, user, pass);
			
			Statement statement=connection.createStatement();
			
			String insertQuery="insert into raj value(1,'raj','S@gmail.com')";
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
