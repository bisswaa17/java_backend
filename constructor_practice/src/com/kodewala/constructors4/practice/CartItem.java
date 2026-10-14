package com.kodewala.constructors4.practice;

public class CartItem {
	String productId;
	String productName;
	double price;
	int quantity;

	public CartItem(String _productName, double _price, int _quantity) {

		this.productName = _productName;
		this.price = _price;
		this.quantity = _quantity;

	}

	public CartItem(String _productId) {
		this("notebook", 199, 2);
		this.productId = _productId;

	}

	public void print() {
		System.out.println("ProductId :" + productId);
		System.out.println("Product Name :" + productName);
		System.out.println("Price is:" + price);
		System.out.println("Quantity :" + quantity);
	}

}
