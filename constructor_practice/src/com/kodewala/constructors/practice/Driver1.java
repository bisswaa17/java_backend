package com.kodewala.constructors.practice;

public class Driver1 {
	
	public static void main(String[] args) {
		
		MobilePhone ph= new MobilePhone("VIVO" ,"vivo v80", 65000, 8);
		MobilePhone ph2 = new MobilePhone("Iphone","iphone 18", 180000, 12);
		
		ph.display();
		System.out.println("...........");
		ph2.display();
	}

}
