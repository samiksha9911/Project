package com.project;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		StudentInput input = new StudentInput();
        input.getStudentData();
	
		
		ChooseQues ques = new ChooseQues();
		ques.chooseQuestion();
		ques.storeMarks();
		
		ShowMarks mar = new ShowMarks();
		mar.getMarks();
		
		

	}

}
