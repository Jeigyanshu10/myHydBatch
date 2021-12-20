package com.te;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDataJdbc {

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
			String query = "update myBatchDetails set traineeCity=? where traineeId=?";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Please enter the trainee ID");

			int tid = Integer.parseInt(br.readLine());

			int traineeId = tid;

			System.out.println("Please enter the updated city name:");

			String updatedCityName = br.readLine();

			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(2, traineeId);
			pstmt.setString(1, updatedCityName);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println("Number of rows affected : " + rowsAffected);
			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
