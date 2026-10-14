package com.kodewala.constructor1;

public class ProductDetails {

	String productName;
	double price;
	String description;
	int quantity;

	// product have 4 attributes.
	public ProductDetails(String _pName, double _price, String _des, int _quant) {
		System.out.println("Scenario 1");
		this.productName = _pName;
		this.price = _price;
		this.description = _des;
		this.quantity = _quant;

	}

	// product with 2 attributes
	public ProductDetails(String _pName2, String _des2) {
		System.out.println("Scenario 2");
		this.productName = _pName2;
		this.description = _des2;

	}

	// product have no attributes

	public ProductDetails() {
		System.out.println("Scenario 3");

	}

}
