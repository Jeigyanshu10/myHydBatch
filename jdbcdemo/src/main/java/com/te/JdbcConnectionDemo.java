package com.te;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionDemo {
	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/batch_hyd";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			con.close();
			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Conncetion is active");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
