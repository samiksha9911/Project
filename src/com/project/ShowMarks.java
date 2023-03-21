package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowMarks {
	
	public void getMarks () throws SQLException {
		System.out.println("Results are:");
		
		try {
			Connection connection = CommonConnection.getConnection();
			PreparedStatement ps=connection.prepareStatement("Select * from student ORDER BY marks Asc");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println();
				System.out.println("Rollno is:"+ rs.getInt(1));
				System.out.println("Name is:"+rs.getString(2));
				System.out.println("Marks of a student are:"+rs.getInt(3));
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
