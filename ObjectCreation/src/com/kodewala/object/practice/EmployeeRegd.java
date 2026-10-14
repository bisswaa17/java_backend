package com.kodewala.object.practice;

class superEmployee {
	static String company;

	public superEmployee(String company) {
		super();
		this.company = company;
		System.out.println("i am the super class");
	}

}

public class EmployeeRegd extends superEmployee {
	String department;
	String salary;

	public EmployeeRegd(String department, String salary) {
		super("google");
		// call IIB in 2nd line ...
		this.department = department;
		this.salary = salary;
//		System.out.println("salary is :");
	}

	{
		System.out.println("Department is :" + "IT");
		System.out.println("Salary is :" + "25000");
	}
	// static after class loading
	static {
		System.out.println("company name is " + EmployeeRegd.company);
	}

}
