package jdbc_statement1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayController {

	public static void main(String[] args) {
		Connection con =UserConnection.userGetConnection();
		
		try {
			Statement st=con.createStatement();
			
			String display ="select * from student";
			ResultSet r= st.executeQuery(display);
			
			while(r.next()) {
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
