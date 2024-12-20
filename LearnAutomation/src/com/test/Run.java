package com.test;

import java.util.Scanner;

public class Run {
	public static Double totalMarks = 500.0;
	public Double yourMark;
	public void findGrade(Double yourMark2) {
		Double perc = (yourMark/totalMarks)*100;
		System.out.println("Pecentage : "+perc);
		if(perc>80) {
			System.out.println("You have achieved A+ grade");
		}
		else if(perc>70 & perc<=80) {
			System.out.println("You have achieved A grade");
		}
		else if(perc>60 & perc<=70) {
			System.out.println("You have achieved B+ grade");
		}
		else if(perc>50 & perc<=60) {
			System.out.println("You have achieved B grade");
		}
		else if(perc>40 & perc<=50) {
			System.out.println("You have achieved C grade");
		}
		else {
			System.out.println("You recieved D grade you are failed");
		}
	}
	
	public void findGradeSwitch(Double mark) {
		Integer perc = (int) (Math.floor((mark/totalMarks)*100));
		System.out.println("Percentage : "+perc);
		switch(perc/10) {
		case 8,9,10 -> System.out.println("You have achieved A+ grade");
		case 7 -> System.out.println("You have achieved A grade");
		case 6 -> System.out.println("You have achieved B+ grade");
		case 5 -> System.out.println("You have achieved B grade");
		case 4 -> System.out.println("You have achieved C grade");
		case 3,2,1,0 -> System.out.println("You have D grade : FAILED");
		}
		
	}
	public void findErrorMessage(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the error code");
		Integer code = sc.nextInt();
		String message = HttpErrorCodes.getErrorMessage(String.valueOf(code));
		System.out.println(message);
	}
	

	public static void main (String args[]) {
		Run r = new Run();
		r.findErrorMessage();
		DuplicateWord duplicateWord = new DuplicateWord();
		duplicateWord.findDuplicate();
		Calculator calculator = new Calculator();
		calculator.calculate();
		StatusCodeExplanation statusCodeExplanation = new StatusCodeExplanation();
		statusCodeExplanation.giveStatusExplanation();
		Scanner sc = new Scanner(System.in);
		Run r1 =new Run();
		System.out.println("Enter your Mark");
		r1.yourMark = sc.nextDouble();
		r1.findGradeSwitch(r1.yourMark);
		sc.close();
	}

}
