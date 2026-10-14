package com.kodewala.constructors3.practice;

class Vehicle extends Object {
	String brand;
	int speed;

	public Vehicle(String _brand, int _speed) {
		//super(); // if i was not calling then called by compiler implicitly....

		this.brand = _brand;
		this.speed = _speed;
		System.out.println("parent class ");

	}

}

public class Car extends Vehicle {

	int numberOfDoors;
	String color;
	int wheels;

	public Car() {
		super("BMW", 300); // first line must be called by super() or this()
//		this.numberOfDoors = _numberOfDoors;
		System.out.println("default constructor ");
		
	}
	
	public Car(int _numberOfDoors, String _color,int _wheels)
	 {
		this();
		this.color = _color;
		this.numberOfDoors = _numberOfDoors;
		this.wheels = _wheels;
		System.out.println("Parameterised constructor ");
	}

	void display() {
		System.out.println("Brand Name :" + brand);
		System.out.println("Speed is :" + speed);
		System.out.println("No of doors :" + numberOfDoors);
		System.out.println("Color :"+color);
		System.out.println("Wheels :"+wheels);
	}

}
