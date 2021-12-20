package com.te;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatTableUsingJdbc {

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/batch_hyd";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Create a query
			String query = "create table myBatchDetails(traineeId int(20) primary key auto_increment,traineeName varchar(50) not null, traineeAge int(10),traineeGender varchar(10),traineeCity varchar(20)) ";

			// Create a statement:
			Statement stmt = con.createStatement();
			int rowsAffected = stmt.executeUpdate(query);
			System.out.println("Number of rows affected : " + rowsAffected);
			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
