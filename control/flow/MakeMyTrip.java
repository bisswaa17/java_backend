package com.kodewala.control.flow;

public class MakeMyTrip {

	public void doBooking(int fare) {

		int discount;
		int totalFare;

		if (fare <= 5000) {
			System.out.println("no discount apply");

		} else if (fare > 5000 && fare <= 10000) {
			System.out.println("10% discount");

			discount = fare * 10 / 100;

			if (discount > 1250) {
//				System.out.println("maximum discount 1250");
				discount =  1250;
			} else {
				totalFare = fare - discount;
				System.out.println();
			}

		} else if (fare > 10000) {
//			System.out.println("15% discount");
			discount = fare * 15 / 100;

			if (discount > 1250) {
				System.out.println("maximum discount 1250");
				discount = 1250;
			}

			else {
				totalFare = fare - discount;
				System.out.println();
			}

//			int totalFare = fare - dis;
//			System.out.println(totalFare);

		} else {
			System.out.println("Maximum discount is 1250/- ");
		}
	}

}
