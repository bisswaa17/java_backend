package com.kodewala.control.flow2p;

public class FlightTicket {

	public void bookTicket(int price) {
		int discount;
		int totalPrice;

		if (price < 5000) {
			System.out.println("Sorry ! You didn't get any Discount ");

		} else if (price >= 5000 && price <= 10000) {
			System.out.println("Discount is 10%");

			discount = price * 10 / 100;
			totalPrice = price - discount;
			System.out.println("After Discount You have to Pay:" + totalPrice);
		} 
		else if (price > 10000 && price < 20000) {

			System.out.println("Discount is 15%");
			discount = price * 15 / 100;
			totalPrice = price - discount;
			System.out.println("After Discount you Have to pay :" + totalPrice);
		} else if (price > 20000) {
			System.out.println("You are lucy customer !! you got maximum discount 20%");

			discount = price * 20 / 100;
			totalPrice = price - discount;
			System.out.println("After Discount Price is :" + totalPrice);
		}

		else {
			System.out.println("Discount Not Applicable ");

		}

	}

}
