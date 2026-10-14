package com.kodewala.constructors.practice;

public class CompanyEmp {

	String companyName;
	String companyLocation;
	//static int totalEmployee;

	public CompanyEmp(String _compName, String _location) {
		this.companyName = _compName;
		this.companyLocation = _location;

	}

	public void displayCompany() {
		System.out.println("Company Name:" + companyName);
		System.out.println("Company Location :" + companyLocation);
	}

}
