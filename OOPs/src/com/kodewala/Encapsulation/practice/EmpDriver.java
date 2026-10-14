package com.kodewala.Encapsulation.practice;

public class EmpDriver {

	public static void main(String[] args) {
		EmployeeSalary emp = new EmployeeSalary();
		emp.setName("Biswajit");
		emp.setEmpId(999);
		emp.updateSalary(40000);
		
		
		
		emp.displayDetaiils();
		

	}

}
