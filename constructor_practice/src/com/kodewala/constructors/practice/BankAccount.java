package com.kodewala.constructors.practice;

public class BankAccount {
	
	String accountHolderName ;
	String accountNumber;
	double accountBalance;
	
	static String bankName = "SBI";
	
	
	
	
	public BankAccount(String _accHolName, String _accNumber, double _accBalance)
	{
		// TODO Auto-generated constructor stub
		
		this.accountHolderName = _accHolName;
		this.accountNumber = _accNumber;
		this.accountBalance = _accBalance;
		
		
		
	}

	
	public double deposite(double balance ) {
	 accountBalance = accountBalance + balance;
		return  accountBalance;
	}
	
	public double withdraw(double balance ) {
//		double curBalance3 = curBalance1;
		double deposite = deposite(balance);
		accountBalance = accountBalance - balance ;
		return  accountBalance;
		
		
	}
	
	public  void avlBalance() {
//		System.out.println("After Successful deposite Balance is : "+ accountBalance);
//		System.out.println("After Withdraw Balance is :"+accountBalance);
//		
	}


}
