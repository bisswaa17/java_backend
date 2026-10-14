package com.kodewala.whileLoops;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
//		int max = 10 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the max no ");
		int max = sc.nextInt();
		
		int number = 0;
		
		while (number < max ) // this will execute till condition is true .
		{
			System.out.println("number is :"+number);
			number ++;
			
		}


	}

}
