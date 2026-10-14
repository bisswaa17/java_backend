package com.kodewala.control.flow2p;

public class UberRider {

	public void riderDetails(boolean isAvailable, boolean validLocation,

			boolean paymentDone) {
		if (!isAvailable) {
			System.out.println("SORRY... ! No Drivers Available at this Moments");

		} else if (validLocation == true && paymentDone == true) {
			System.out.println("Ride CONFIRMED.. and  your PILOT is on the way....");
		} else {
			System.out.println("Unable to Book" +" " +"Try after sometimes...!!");
		}

	}

}
