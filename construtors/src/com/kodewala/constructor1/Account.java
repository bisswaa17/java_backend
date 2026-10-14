package com.kodewala.constructor1;

public class Account {

	int amount;
	String name;

	// if a developer not providing any constructor then compiler will
	// create a default constructor (no arg constructor)

	Account() {
		System.out.println("default constructor");
	}

	// Parameterized constructor
	Account(int _amount, String _name) {
		System.out.println("this constructor have two arg");

		this.amount = _amount;
		this.name = _name;

	}

}
