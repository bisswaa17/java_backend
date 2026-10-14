package com.kodewala.Encapsulation.practice;

public class EmployeeSalary {
	private String empName;
	private int empId;
	private double salary;

	public void setName(String empName) {
		this.empName = empName;

	}

	public void setEmpId(int empId) {
		if (empId > 0) {
			this.empId = empId;
		} else {
			System.out.println("Invalid Employee Id");
		}
	}

	public void updateSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;

			System.out.println("Salary update successful");
		} else {
			System.out.println("Invalid salary");

		}

	}

	public double getSalary() {
		return salary;

	}

	public void displayDetaiils() {
		System.out.println("Employee name :" + empName);
		System.out.println("Employee id :" + empId);
		System.out.println("Employee Salary :" + salary);
	}

}
