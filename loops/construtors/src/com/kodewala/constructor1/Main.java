package com.kodewala.constructor1;

public class Main {
	public static void main(String[] args) {

		ProductDetails pd1 = new ProductDetails("Laptop", 50000, "Best Laptop in the World", 2);
		System.out.println("Product Name :" + pd1.productName + " " + "Price is :" + pd1.price + " " + "Description:"
				+ pd1.description + " " + "Quantity" + pd1.quantity);

		ProductDetails pd2 = new ProductDetails("iphone ", "Best for Security");

		System.out.println("Product Name : " + pd2.productName + " " + "Description:" + pd2.description);

		ProductDetails pd3 = new ProductDetails();
		System.out.println("Product have no attributes");

	}

}
