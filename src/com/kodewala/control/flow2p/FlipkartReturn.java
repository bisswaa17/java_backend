package com.kodewala.control.flow2p;

/**
 * This is belongs to flipkart Return class.
 */

public class FlipkartReturn {

	public void returnProduct(boolean nonReturnable, boolean isDamage, int daysSinceDelivery) {

		if (nonReturnable == true) {
			System.out.println("This Product is Non - Returnable");
		} else if (isDamage == true) {
			System.out.println("This product is Allowed Return after 7 day also");

		} else if (daysSinceDelivery <= 7) {
			System.out.println("You can Return this product with in 7 days ");
		} else {
			System.out.println("Return Not Allowed");
		}
	}

}
