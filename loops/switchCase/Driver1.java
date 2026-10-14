package com.kodewala.switchCase;

public class Driver1 {
	public static void main(String[] args) {
		Ecommerce em = new Ecommerce();

		String customerType = args[0];
		int price = Integer.parseInt(args[1]);
		
		if (price >= 1000) {
			em.calculateDiscount(customerType, price);
		} else {
			System.out.println("you have to purchase minimum 1000 rupees.");
			return;
		}

	}
}