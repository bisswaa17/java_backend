package com.kodewala.scanner.practice;

import java.util.Scanner;

public class EmployeSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salary = 0;
		System.out.println("Enter the Salary of Employee..");

		if (sc.hasNextInt()) {

			salary = sc.nextDouble();
			double annualSalary = salary * 12;

			System.out.println("Annual Salary is :" + annualSalary);

		} else {
			System.out.println("Invalid salary");
		}
		sc.close();

	}

}
