package com.kodewala.Encapsulation;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment(10000);

//	payment.balance = 10000; // we cannot do that because balance is private ..only
		                     // we can change by public setter methods..
		payment.doCredit(200);
//		payment.doDebit(500);
//		System.out.println("Payment debit :"+payment.doDebit(200));

		System.out.println("Available balance is :"+ payment.getBalance());

	}

}
