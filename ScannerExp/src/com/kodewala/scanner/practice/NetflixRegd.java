package com.kodewala.scanner.practice;

import java.util.Scanner;

public class NetflixRegd {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Full Name :");
	String name = sc.nextLine();
	
	System.out.println("Enter the Email:");
	String email = sc.nextLine();
	
	System.out.println("Enter the age :");
	int age = sc.nextInt();
	
	System.out.println("Enter the mobile number :");
	String mobile = sc.nextLine();
	
	System.out.println("Enter the plan:");
	String plan = sc.nextLine();
	
	 System.out.println("\n Please fill the Details....");
	System.out.println("Full Name:"+name);
	System.out.println("Enter Email:"+email);
	System.out.println("Enter age:"+age);
	System.out.println("Enter Mobile Number :"+mobile);
	System.out.println("Enter the Plan :"+plan);
	
	
	sc.close();
	
	}

}
