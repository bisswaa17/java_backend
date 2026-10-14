package com.kodewala.constructors.practice;

public class Main {
	public static void main(String[] args) {
		
		StudentsInfo s1 = new StudentsInfo("Biswa",121,85.0);
		StudentsInfo s2 = new StudentsInfo("Satya", 115, 90);
		StudentsInfo s3 = new StudentsInfo("Rohit", 125, 74);
		
		s1.displayStudent();
		System.out.println();
		
		s2.displayStudent();
		System.out.println();
		
		s3.displayStudent();
		
		
		
	
	}

}
