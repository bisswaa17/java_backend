package com.kodewala.object.practice;

public class BankAccount {
	static String ifscCode;
	static String bankName;
	String address;
	String userName;
	
	public BankAccount (String address, String userName) {
		super();
		this.address = address;
		this.userName= userName;
		System.out.println("Address is "+this.address);
		System.out.println("User name is :"+this.userName);
	}
 // it will executed only ONCE at the time of class load ...
	// no matter how many object is created .....
	static {
		System.out.println("Bank name :"+"SBI");
		System.out.println("IFSC code is :"+"SBIN0001789");
		
	}


}
