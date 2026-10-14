package com.kodewala.constructors3.practice;

public class Mobile {
	double price;
	String brand;
	String color;
	int ram;
	
	

	public Mobile(double _price, String _brand, String _color, int _ram)

	{
		// constructor contain 4 args ...
		this("VIVO", "RED", 78);

		this.price = _price;
		this.brand = _brand;

	}

	Mobile(String _brand, String _color, int _ram) {

		// constructor contain 3 args....
		this("oppo", "green");

		System.out.println("3 arg constructor");
	}

	Mobile(String name, String _color) {
		this();
//		System.out.println("Brand is :" + _brand + "  " + "Color is:" + _color);

		System.out.println("2 args constructor ..");

	}
//
////
	Mobile() {

		// default constructor ....
	}
//	Mobile(Object...is){
//		
//		for (Object i : is) {
//			System.out.println("No : "+ i);
//		}
//	}

	public void display() {
		System.out.println("Price of the mobile is :" + price);
		System.out.println("Brand of the mobile is :" + brand);
		System.out.println("Color of the mobile is :" + color);
		System.out.println("ram of the mobile is :" + ram);
	}

}
