package com.kodewala.constructors5;

public class ElectronicProduct extends Product {

	int warranty;

	public ElectronicProduct(String _name, int _price, String _productId, int _warranty) {
		super(_name, _price, _productId);
		this.warranty = _warranty;

	}

	public void doPrint() {
		System.out.println("Name :" + name);
		System.out.println("Price:" + price);
		System.out.println("productId:" + productId);
		System.out.println("Warranty :" + warranty);

	}

}