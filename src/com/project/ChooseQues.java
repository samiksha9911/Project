package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;

public class ChooseQues {
	
	   int count =0;
	   
	public void chooseQuestion() throws SQLException {
		
		HashSet<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(4);
		hash.add(5);
		hash.add(6);
		hash.add(7);
		hash.add(8);
		hash.add(9);
		hash.add(10);
		
		System.out.println(hash);
		System.out.println( );
		
		HashSet<Integer> set = new HashSet<>();
		for (int i=1; i<=10;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Choose the Question");
			int quesno = scan.nextInt();
			
			if(set.contains(quesno)) {
				System.out.println(">>>>>>Duplicates>>>>>>");
				i--;	
			} else {{
				set.add(quesno);
			}
		
			try {
			//	CommonConnection commonconnection = new CommonConnection();
				
				Connection connection = CommonConnection.getConnection();
				
			//	Connection connection = connection.getConnection();
				PreparedStatement ps = connection.prepareStatement("Select * from question Where id="+ quesno);
				
				ResultSet result = ps.executeQuery();
				
				while(result.next()){
					
					System.out.println("Questions is::"+result.getString(2));
					System.out.println("Options are:");
					System.out.println(result.getString(3));
					System.out.println(result.getString(4));
					System.out.println(result.getString(5));
					System.out.println(result.getString(6));
					
					if(quesno==1) {
						Scanner scanner = new Scanner(System.in);
						System.out.println("Choose the option:");
						String opt = scanner.next();
						String a= "A";
						if(opt.equals(a)) {
							System.out.println("Answer is Correct:");
							count++;
							
						}else {
							System.out.println("Answer is wrong");
							System.out.println("Correct answer is>>"+result.getString(7));
						}
					}
					
					if(quesno==2) {
						Scanner scanner = new Scanner(System.in);
						System.out.println("Choose the Question");
						String opt = scanner.next();
						String b ="C";
						if(opt.equals(b)) {
							System.out.println("Answer is Correct:");
							count++;
						}else {
							System.out.println("Answer is Wrong>");
							System.out.println("Correct answer is>>"+ result.getString(7));
						}
					}
				
			      if(quesno==3) {
				  Scanner scanner = new Scanner(System.in);
				  System.out.println("Choose the option:");
				  String opt = scanner.next();
				  String c= "C";
				  if(opt.equals(c)) {
					System.out.println("Answer is Correct");
					count++;	
				} else {
					System.out.println("Answer is wrong");
					System.out.println("Correct answer is>>"+result.getString(7));
				}
			      }
			
			          if(quesno==4) {
			          Scanner scanner = new Scanner(System.in);
			          System.out.println("Choose the option:");
			          String opt = scanner.next();
			          String d= "D";
			          if(opt.equals(d)) {
				         System.out.println("Answer is Correct");
				         count++;
				
			        }else {
				       System.out.println("Answer is wrong");
				       System.out.println("Correct answer is>>"+result.getString(7));
			        }  
			    }
				
	                if(quesno==5) {
	                    Scanner scanner = new Scanner(System.in);
	                    System.out.println("Choose the option:");
	                    String opt = scanner.next();
	                    String e= "C";
	                    if(opt.equals(e)) {
		                    System.out.println("Answer is Correct");
		                    count++;
		
	               }else {
		                  System.out.println("Answer is wrong");
		                  System.out.println("Correct answer is>>"+result.getString(7));    
	               }
	                }
         
                      if(quesno==6) {
            	       Scanner scanner = new Scanner(System.in);
            	       System.out.println("Choose the option:");
	                   String opt = scanner.next();
	                   String f= "A";
	                   if(opt.equals(f)) {
		                  System.out.println("Answer is Correct");
		                    count++;
		
	                   }else {
		                  System.out.println("Answer is wrong");
		                  System.out.println("Correct answer is>>"+result.getString(7));
		                 
	           }
             }
	               
	               if(quesno==7) {
	              	 Scanner scanner = new Scanner(System.in);
	              	 System.out.println("Choose the option:");
	  	             String opt = scanner.next();
	  	             String g= "A";
	  	               if(opt.equals(g)) {
	  		                System.out.println("Answer is Correct");
	  		                    count++;
	  		
	  	               }else {
	  		                  System.out.println("Answer is wrong");
	  		                  System.out.println("Correct answer is>>"+result.getString(7));
	  		                
	  	           } 
	               }
            	      
	  	             if(quesno==8) {
	  	            	 Scanner scanner = new Scanner(System.in);
	  	            	 System.out.println("Choose the option:");
	  		             String opt = scanner.next();
	  		             String h= "B";
	  		              if(opt.equals(h)) {
	  			             System.out.println("Answer is Correct");
	  			             count++;
	  			
	  		               }else {
	  			                System.out.println("Answer is wrong");
	  			                System.out.println("Correct answer is>>"+result.getString(7));
	  			             
	  		           }
	  	             }
	  		               
	  		             if(quesno==9) {
	  		            	 Scanner scanner = new Scanner(System.in);
	  		            	 System.out.println("Choose the option:");
	  			             String opt = scanner.next();
	  			             String k= "A";
	  			               if(opt.equals(k)) {
	  				            System.out.println("Answer is Correct");
	  				             count++;
	  				
	  			               }else {
	  				                  System.out.println("Answer is wrong");
	  				                  System.out.println("Correct answer is>>"+result.getString(7));
	  				              
	  				                
	  			           }
	  		             }  
	  			             if(quesno==10) {
	  			            	 Scanner scanner = new Scanner(System.in);
	  			            	 System.out.println("Choose the option:");
	  				             String opt = scanner.next();
	  				             String j= "A";
	  				               if(opt.equals(j)) {
	  					           System.out.println("Answer is Correct");
	  					            count++;
	  					
	  				               }else {
	  					                  System.out.println("Answer is wrong");
	  					                  System.out.println("Correct answer is>>"+result.getString(7));
	  					                
	  				                }
				                  }
	  			             
				}
			}               catch (Exception e) {
			
				              e.printStackTrace();
			              }
		            	System.out.println("marks are::"+count);	
			}
                }
		          
		      }
		          public void storeMarks() {
			      StudentInput input = new StudentInput();
			      int rollno = input.num;
			      System.out.println("Roll Number is" + rollno);
			      
			     
				try {
			
					Connection connection = CommonConnection.getConnection();
					
					PreparedStatement ps = connection.prepareStatement("Update Student set marks =? where rollno = " + rollno);
			
					ps.setInt(1, count);
					
					int a = ps.executeUpdate();
				
					System.out.println("Marks Stored");
					
					PreparedStatement ps1 = connection.prepareStatement("select marks from student where rollno="+ rollno);
					ResultSet rs1 = ps1.executeQuery();
					
					while(rs1.next()) {
						
						 System.out.println("Roll Number"+ rollno + " " + "Marks you got" + rs1.getInt(1)); 
					}
					
				
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
					  
				
			      
	}
	        
	        	         
	          
}