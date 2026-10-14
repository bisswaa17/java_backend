package com.kodewala.forLoops;
/**
 * This is Amazon Product class
 */

public class AmazonProduct {

	public static void main(String[] args) {

		int[] productPrice = new int[5];

		productPrice[0] = 1200;
		productPrice[1] = 2500;
		productPrice[2] = 800;
		productPrice[3] = 1500;
		productPrice[4] = 3000;

		// using for loop for print the all value ..
		for (int i = 0; i < productPrice.length; i++) {
			System.out.println("Product Price[" + i + "] =" + productPrice[i]);
		}

	}

}
