package com.kodewala.scanner.practice;

import java.util.Scanner;

public class FoodDelivery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the customer name ");
		String name = sc.nextLine();
		
		System.out.println("enter the Food item");
		String item = sc.nextLine();
		
		System.out.println("Quantity");
		int quantity = sc.nextInt();
		
		System.out.println("enter the price item");
		double price = sc.nextDouble();
		
		double totalAmount = quantity * price;
		
		
		System.out.println("\n Order Details ");
		System.out.println("Customer Name:"+name);
		System.out.println("Item :"+item);
		System.out.println("Quantity :"+quantity);
		System.out.println("Price for Each item :"+price);
		
		System.out.println("Total Amount to Paid :"+totalAmount);
		
		sc.close();
	}

}
