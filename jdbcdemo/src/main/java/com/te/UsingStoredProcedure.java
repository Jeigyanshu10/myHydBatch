package com.te;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class UsingStoredProcedure {
	Connection con;

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/batch_hyd?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Issue the statement
			String query = "{call fetchStudentData(?)}";
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the name of the student you want to search for:");
			String studentName = scan.nextLine();
			CallableStatement cstc = con.prepareCall(query);
			cstc.setString(1, studentName);
			ResultSet rs = cstc.executeQuery();

			// Processing the result out of the db:
			while (rs.next()) {
				int tid = rs.getInt(1);
				String name = rs.getString("traineeName");
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
