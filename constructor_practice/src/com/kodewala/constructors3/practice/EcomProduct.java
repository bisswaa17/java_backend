package com.kodewala.constructors3.practice;

class SuperProduct {

	String brand;

	SuperProduct(String _brand) {
		
		this.brand = _brand;
		
		System.out.println("Parent class construtor ");

	}
}

public class EcomProduct extends SuperProduct {
	String ProductName;
	double price;
	int Warranty;

	public EcomProduct(String _ProductName, double _price, int _Warranty) {
		super("Sony");
		this.ProductName = _ProductName;
		this.price = _price;
		this.Warranty = _Warranty;
	}

	void display() {
		System.out.println("Product Brand :" + brand);
		System.out.println("product name :" + ProductName);
		System.out.println("Price is :" + price);
		System.out.println("Warranty for:" + Warranty + "yrs");
	}

}
