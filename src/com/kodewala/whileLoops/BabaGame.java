package com.kodewala.whileLoops;

import java.util.Scanner;

public class BabaGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int luckyNumber = 17 ;
		int userEntered = 0;

		while (luckyNumber != userEntered) {
			System.out.println("Pls guess the number...");
			userEntered = sc.nextInt();

			if (userEntered == luckyNumber) {
				System.out.println("You Won !!");
			} else {
				System.out.println("Please try again...");
			}
		}
		sc.close();

	}

}
