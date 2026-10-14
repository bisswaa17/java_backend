package com.kodewala.constructors.practice;

public class MobilePhone {
	
	String brand ;
	String model;
	double price ;
	int ram ;
	
	static String operatingSystem = "Android";
	
	public MobilePhone(String _brand, String _model,double _price, int _ram)
	{
		this.brand = _brand;
		this.model = _model;
		this.price = _price;
		this.ram = _ram;
	}
	
	
	public void display() {
		System.out.println("Brand is :"+ brand);
		System.out.println("Model :"+ model);
		System.out.println("Price of the phone :"+price);
		System.out.println("Installed RAM : "+ram);
		
	}

	
}
