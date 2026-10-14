package com.kodewala.switchCase;

public class Ecommerce {

	int discount;

	int pay;

	public void calculateDiscount(String type, int price) {
		switch (type) {
		case "Gold":
//			System.out.println("GOLD customer... ");

			discount = price * 20 / 100;
			
			
			if (discount >= 2500) {
				System.out.println("You got flat 2500 off");
			} else {
				pay = price - discount;
				System.out.println("You have to pay " + pay);
			}

			break;
		case "Silver":
//			System.out.println("SILVER customer... ");
			discount = price * 10 / 100;
			if (price >= 2500) {
				discount = 2500;
			} else {
				pay = price - discount;
				System.out.println("You have to pay " + pay);
			}

			break;
		case "Regular":
//			System.out.println("REGULAR customer... ");
			discount = price * 5 / 100;
			
			if (price >= 2500) {
				discount = 2500;
			} else {
				pay = price - discount;
				System.out.println("You have to pay " + pay);
			}

			break;

		default:

			System.out.println("invalid customer type ");

			break;

		}

	}

}
