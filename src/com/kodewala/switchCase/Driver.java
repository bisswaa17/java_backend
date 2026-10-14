package com.kodewala.switchCase;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Driver dv = new Driver (); // creating a object for Driver class ..
		
		int num = Integer.parseInt(args[0]); // taking input from command line argument ..
		
//		Scanner sc = new Scanner (System.in);
//		String num = sc.NextLine();
		
		dv.verifyDay(num);
		

	}

	 public void verifyDay (int day ) {
		 switch (day) {
		case 1:
			System.out.println("Monday");
			
			break;
		case 2:
			System.out.println("Tuesday");
			
			break;
		case 3:
			System.out.println("WednesDay");
			
			break;
		case 4:
			System.out.println("ThursDay");
			
			break;
		case 5:
			System.out.println("FriDay");
			
			break;
		case 6:
			System.out.println("Saturday");
			
			break;
		case 7:
			System.out.println("SunDay");
			
			break;

		default:
			System.out.println("please enter a valid number...");
			break;
		}
	 }
}
