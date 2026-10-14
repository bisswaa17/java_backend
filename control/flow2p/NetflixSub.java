package com.kodewala.control.flow2p;

public class NetflixSub {

	public void subscriptionPlan(int plan) {

		if (plan == 199) {
			System.out.println("Mobile plan  and only one user can use");

		} else if (plan == 499) {
			System.out.println("Standard plan (1 mobile and 1 laptop )");

		} else if (plan == 699) {
			System.out.println("Premium plan ");
			System.out.println("You can use 2 mobile with HD quality");

		} else {
			System.out.println("invalid plan ");
		}

	}

}
