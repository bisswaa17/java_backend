package com.kodewala.forLoops;

public class FlipkartDiscount {

	public void discount(int[] price) {
		for (int i = 0; i < price.length; i++) {
			System.out.println();
			if (price[i] > 2000) {
				System.out.println("\n 10% Discount Avaiable");
				int discountPrice = price[i] * 10 / 100;
				int finalPrice = price[i] - discountPrice;
				System.out.println(" \n After Discount you have to pay " + finalPrice);
			} else {
				System.out.println("\n No Discount !!" + "Pay " + price[i]);
			}
		}
	}

}
