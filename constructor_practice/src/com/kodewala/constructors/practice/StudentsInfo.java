package com.kodewala.constructors.practice;

public class StudentsInfo {

	String name;
	int rollNumber;
	double mark;
	static String instName = "Kodewala Academy";

	public  StudentsInfo(String _name, int _rollNumber, double _mark) {

		this.name = _name;
		this.rollNumber = _rollNumber;
		this.mark = _mark;

	}
	
	void displayStudent() {
		System.out.println("Name :"+name);
		System.out.println("RollNumber :"+rollNumber);
		System.out.println("mark:"+ mark);
		System.out.println("Institute Name :"+ StudentsInfo.instName);
		
	}

}
