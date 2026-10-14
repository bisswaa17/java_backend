package com.kodewala.constructors4.practice;

public class AddressMgmt {
	String city;
	String state;
	String pin;

	public AddressMgmt() {
		// default construtor .
		this("Balasore");
		System.out.println("default constructor");

	}

	public AddressMgmt(String _city) {
		this("Balasore", "Odisha");

		System.out.println("Constructor contain 1 arg");

	}

	public AddressMgmt(String _city, String _state) {
		this("Balasore", "Odisha", "756001");
		System.out.println("constructor contain 2 args ");

	}

	public AddressMgmt(String _city, String _state, String _pin) {

		this.city = _city;
		this.state = _state;
		this.pin = _pin;

		System.out.println("constructor conatain 3 args  ");

	}
	
	void displayDetails() {
		System.out.println("City:"+city);
		System.out.println("State :"+state);
		System.out.println("Pin:"+pin);
	}

}
