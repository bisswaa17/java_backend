package com.kodewala.constructors5;
/**
 * This is a Product class in Ecom Websites.
 */

public class Product {
	String name;
	int price;
	String productId;

	public Product(String _name, int _price, String _productId) {
		super(); // super with no arg ....
		this.name = _name;
		this.price = _price;
		this.productId = _productId;
	}

}
