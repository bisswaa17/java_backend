package com.kodewala.scanner.practice;

import java.util.Scanner;

public class AtmValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pin = 0;
		System.out.println("Enter your 4-digit ATM pin :");
//		while(pin == pin) {
		if(sc.hasNextInt()) {
			pin = sc.nextInt();
			if( pin>= 1000 && pin <= 9999) {
				
//				if(pin == 2222) {
//					System.out.println("PIN accepted ");
//					
//				}else {
//					System.out.println("Wrong pin");
//				}
				System.out.println("PIN accepted ");
			}
			else {
				System.out.println("Invalid PIN");
			}
		}
		else  {
			System.out.println("please Enter the number only");
		}
		
		sc.close();
		
//	  }
	}

}
