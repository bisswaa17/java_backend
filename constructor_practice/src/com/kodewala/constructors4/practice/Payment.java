package com.kodewala.constructors4.practice;

public class Payment {
	String trnxId;
	double amount;
	String paymentMethod;
	String currency;
	String status;

	// Transaction Id
	public Payment(String trnxId) {
		this(trnxId, 0.0, "Not-Selected", "INR", "PENDING");

	}

	// Transaction id + amount
	public Payment(String trnxId, double amount) {
		this(trnxId, amount, "Not-Selected", "INR", "PENDING");

	}
	// Transaction id + amount + payment method

	public Payment(String trnxId, double amount, String paymentMethod) {
		this(trnxId, amount, paymentMethod, "INR", "PENDING");

	}

	// Transaction id + amount + payment method+currency
	public Payment(String trnxId, double amount, String paymentMethod, String currency) {
		this(trnxId, amount, paymentMethod, currency, "PENDING");

	}

	// Transaction id + amount + payment method+currency+status
	public Payment(String trnxId, double amount, String paymentMethod, String currency, String status) {
		this.trnxId = trnxId;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.currency = currency;
		this.status = status;

	}
	
	void showDetails() {
		System.out.println("Trnsaction id:"+trnxId);
		System.out.println("AMount is :"+amount);
		System.out.println("Payment Method:"+paymentMethod);
		System.out.println("currency :"+currency);
		System.out.println("Payment status :"+status);
	}

}
