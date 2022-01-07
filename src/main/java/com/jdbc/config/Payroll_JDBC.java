package com.jdbc.config;
import java.sql.*;
public class Payroll_JDBC {

	static final String URL = "jdbc:mysql://localhost:3306/payroll_service";
	
	public static void main(String[] args) {
		
		String uname = "root";
		String password = "root";
		Connection con ;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");								// Step1 loading database driver
			con = DriverManager.getConnection(URL, uname, password)	;				// Step2 establish connection with DB
			if(con != null ) { 
				System.out.println("Connection to Database established");
			}
			else {
				System.out.println("Not connected");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
