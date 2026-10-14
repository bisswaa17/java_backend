package com.kodewala.control.flow1;

/**
 * this
 */

public class Booking {

	public String doBooking(String from, String to, int noOfPax) {
		
		String pnr=null;

		if (noOfPax > 6) {
			// if true then only below code gets executed ..

			// do not allow to book
			System.err.println("As per IRCTC policy  ,only 6 pax are allowed per PNR ");

		}
		else{
		pnr = "67890432";
		System.out.println("Pnr is :"+pnr);
		System.out.println("Status : CONFIRMED");
		System.out.println("Seat :23 A1");
			
		}
		return pnr;

	}

}
