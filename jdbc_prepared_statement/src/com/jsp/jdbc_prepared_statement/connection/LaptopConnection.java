package com.jsp.jdbc_prepared_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

;

public class LaptopConnection {
	
	/*
	 * public static Connection getLaptopConnetion() {
	 * 
	 * 
	 * try { Class.forName("com.mysql.cj.jdbc.Driver");
	 * 
	 * String url ="jdbc:mysql://localhost:3306/sencondtimepreparadstatement";
	 * String user ="root"; String pass="0786";
	 * 
	 * return DriverManager.getConnection(url, user, pass); } catch
	 * (ClassNotFoundException | SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } return null; }
	 */
	
	public static Connection getLaptopConnection() {
		
		try {
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3306/sencondtimepreparadstatement";
			String user ="root";
			String pass="0786";
			
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
