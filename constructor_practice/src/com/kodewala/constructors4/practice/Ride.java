package com.kodewala.constructors4.practice;

public class Ride {
	String rideId;
	String customerName;
	String pickupPoint;
	String destination;

	public Ride() {
		this("rid_5210");

		System.out.println("default...constructor");

	}

	public Ride(String _rideId) {
		this(_rideId, "alex");
		System.out.println("contain 1 args ");

	}

	public Ride(String _rideId, String _customerName) {
		this(_rideId, _customerName, "SilkBoard");

		System.out.println("contain 2 args ..");

	}

	public Ride(String _rideId, String _customerName, String _pickupPoint) {
		this(_rideId, _customerName, _pickupPoint, "btm");

		System.out.println("contain 3 args ...");

	}

	public Ride(String _rideId, String _customerName, String _pickupPoint, String _destination) {
		this.rideId = _rideId;
		this.customerName = _customerName;
		this.pickupPoint = _pickupPoint;
		this.destination = _destination;

		System.out.println("Contain 4 args ....");
	}

	void showDetails() {
		System.out.println("Ride id is :" + rideId);
		System.out.println("Customer Name :" + customerName);
		System.out.println("PickUp Point:" + pickupPoint);
		System.out.println("Destination :" + destination);
	}

}
