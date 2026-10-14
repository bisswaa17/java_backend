package com.kodewala.Objects;

class Accountmgmt {
	String bankName;

	public Accountmgmt(String bankName) {
		super();
		System.out.println("state bank of india ");
		this.bankName = bankName;
	}
}

public class Account extends Accountmgmt {
	String accountNumber;

	public Account(String accountNumber) {
		super("SBI"); // first line must be either super() or this()
		// call to instance intialization block (IIB) - 2nd line
		System.out.println("Account(String accountNumber)");
		this.accountNumber = accountNumber;
	}
// IIB --->this will get executed whenever object is created...
	{
		System.out.println("Account IIB");
	}

}
