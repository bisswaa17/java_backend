package com.kodewala.scanner.exp;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Creating connection with console

		System.out.println("Enter the name of the product ");
		String name = sc.nextLine(); // reading String input

		System.out.println("Pls Enter the product price");
		int price = sc.nextInt(); // reDING int ---> this will leave new line char (\n)
		sc.nextLine();// consume extra char

		System.out.println("Pls enter the delivery adsress...");
		String address = sc.nextLine();
     //	 String address = sc.next();  ----> this will consume single line char \

		System.out.println("Name is :" + name);
		System.out.println("Price is :" + price);
		System.out.println("Address is :" + address);
		
		sc.close(); //if we have open it we have to close it 

	}

}
