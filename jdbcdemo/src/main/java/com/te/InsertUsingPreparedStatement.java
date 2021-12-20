package com.te;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/batch_hyd?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Create a query
			String query = "insert into myBatchDetails(traineeName,traineeAge,traineeGender,traineeCity) values(?,?,?,?)";

			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "Jeigyanshu Sarangi");
			pstmt.setInt(2, 45);
			pstmt.setString(3, "Male");
			pstmt.setNString(4, "Hyderbad");

			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows affected : " + rowsAffected);
			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
