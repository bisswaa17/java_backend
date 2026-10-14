package com.kodewala.control.flow1;

public class Driver {

	public static void main(String[] args) {

		Booking booking = new Booking();
		String pnr = booking.doBooking("Odisha", "BLR", 6);
		System.out.println("PNR is:" + pnr);
	}

}
