package com.te;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDataUsingJdbc {

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
			String query = "SELECT * FROM mybatchdetails Where traineeId = ?";

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the Trainee ID: ");

			int traineeId = Integer.parseInt(br.readLine());
			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, traineeId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int tid = rs.getInt(1);
				String name = rs.getString("traneeName");
				int age = rs.getInt(3);
				String city = rs.getString("traineeCity");
				String gender = rs.getString(4);
				System.out.println(tid + " -------- " + name + " -------- " + age + " -------- " + gender + " -------- "
						+ "-------- " + city);

			}

			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
