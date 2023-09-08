package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/goldilocksdb";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "root")){
		  
		   Statement st = conn.createStatement();
		   
		   String query = "SELECT empName, empAge FROM test";
		   ResultSet rs = st.executeQuery(query);
		   
		   while (rs.next()) {
               String name = rs.getString("empName");
               int age = rs.getInt("empAge");
               System.out.println("Employee Name: " + name + ", Employee Age: " + age);
           }
		}
		catch(SQLException se) {
			se.printStackTrace();
			System.out.println(se.getMessage());
		}
	}

}
