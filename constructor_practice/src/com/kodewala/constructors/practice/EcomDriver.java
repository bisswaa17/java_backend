package com.kodewala.constructors.practice;

public class EcomDriver {
	public static void main(String[] args) {

		System.out.println("category-1:");

		EcomProduct ep1 = new EcomProduct("m46658p", "macbook", 131000, 5);
		ep1.displayProduct();
		System.out.println("------------");
		System.out.println("category-2:");
		EcomProduct ep2 = new EcomProduct("h8797", "Earbud Pro ", 7500, 10);

		ep2.displayProduct();

	}

}
