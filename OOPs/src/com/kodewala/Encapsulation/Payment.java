package com.kodewala.Encapsulation;

public class Payment {
	private int balance; // data or variable

	public Payment(int balance) {
		super();
		this.balance = balance;
	}

	// setter
	public void doDebit(int _amount) {
		// modifying the data ..
		balance -= _amount;
		System.out.println("Debit amount is :" + _amount);
	}

	public void doCredit(int _amount) { // allow to change the data with controlled access.
		// modifying the data ..
		if (balance > 0)
			balance += _amount;
		System.out.println("credit amount is :" + _amount);

	}

	public int getBalance() {

		return balance;
	}
}
