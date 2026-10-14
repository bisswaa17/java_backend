package com.kodewala.constructors.practice;

public class BankDriver {
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("Biwajit", "1736458679", 4500);
		
		System.out.println("After deposite Amount will be " + ba.deposite(1000));
		
		System.out.println("After withdraw the amoount " + ba.withdraw(500));
		
		
		
		
	}

}
