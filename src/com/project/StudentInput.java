package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInput {
	
	          Connection con = null;
		     PreparedStatement preparedStatement1 = null;
			 static int num;
		
			public void getStudentData() throws SQLException {
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your Roll number");
				int rollnum =scanner.nextInt();
				System.out.println("Enter your name");
				String name =scanner.next();
				System.out.println("NAME IS>>"+name);
				System.out.println("Rollnum>>"+rollnum);
				
				storeStudentData(rollnum,name);
				
				System.out.println("Press 1 to start");
				int enter =scanner.nextInt();
				if(enter==1) {
					System.out.println("WELCOME TO THE JAVA QUIZ");
					System.out.println();
					
				}
			}
			public void storeStudentData(int num,String studname) throws SQLException {
				this.num=num; 
				
				
			
				try {
					 Connection connection = CommonConnection.getConnection();
					PreparedStatement ps1 = connection.prepareStatement("insert into student(rollno,name)values(?,?)");
					ps1.setInt(1, num);
					ps1.setString(2, studname );
					ps1.executeUpdate();
					System.out.println();
					System.out.println("inserted student data");
					System.out.println();
					System.out.println("***********************************************************************");
					System.out.println();
					System.out.println();
					
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}

	}






