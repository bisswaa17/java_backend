package com.kodewala.scanner.practice;

import java.util.Scanner;

public class EcomProductEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the product name :");
		String productName = sc.nextLine();

		System.out.println("Product Description:");
		String prodDescription = sc.nextLine();

		System.out.println("Product price :");

		if (sc.hasNextDouble()) {
			double price = sc.nextDouble();
			
			System.out.println("Product quantity:");

			if (sc.hasNextInt()) {
				int quantity = sc.nextInt();
				sc.nextLine();

				System.out.println("Product category:");
				String category = sc.nextLine();
				
				System.out.println("\n ......PRODUCT DETAILS ....");
				System.out.println("Product Name:"+productName);
				System.out.println("Product Description :"+prodDescription);
				System.out.println("Product Price :"+price);
				System.out.println("Product category :"+category);

			}else {
				System.out.println("Invalid Quantity. plz enter a valid number");
			}

		}else {
			System.out.println("Price is not valid ...? please enter a Number");
		}
         sc.close();
	}

}
