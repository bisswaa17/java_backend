package com.kodewala.constructors.practice;

public class EmpComDriver {
	public static void main(String[] args) {

		CompanyEmp com = new CompanyEmp("Rubrik", "Cessna Business Park ,Kadubeesanahalli, Bengaluru ");

		Employee emp1 = new Employee(124501, "Biswajit", 240000, "SDE-2");
		Employee emp2 = new Employee(124503, "Pruthviraj", 200000, "SDE-2");
		Employee emp3 = new Employee(124505, "B", 60000, "Medical");

		com.displayCompany();
		System.out.println();

		emp1.displayEmployee();
		System.out.println();

		emp2.displayEmployee();
		System.out.println();

		emp3.displayEmployee();
		System.out.println();

	
	}

}
