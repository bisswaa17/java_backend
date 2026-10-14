package com.kodewala.Encapsulation;

public class FundTransfer {
	public String accountHolderName;
	public String accountNumber;
	private double balance;

	public FundTransfer(String accountHolderName, String accountNumber, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	// setter method will transfer the amount .
	public void doTransfer(int amount) {

		if (amount > 0 && amount <= balance) {
			balance -= amount;

		} else {
			System.out.println("please enter valid amount");
		}

	}

	public double getBalance() {
		return balance;
	}
}
