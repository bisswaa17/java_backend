package com.kodewala.constructors.practice;

public class Employee {

	int employeeId;
	String employeeName;
	double salary;
	String department;

	public Employee(int _empId, String _empName, double _salary, String _depart) {
		this.employeeId = _empId;
		this.employeeName = _empName;
		this.salary = _salary;
		this.department = _depart;

	}

	void displayEmployee() {

		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + employeeName);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
	}

}
