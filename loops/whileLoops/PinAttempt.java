package com.kodewala.whileLoops;

import java.util.Scanner;

public class PinAttempt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctPin = 2121;
		int attempt = 0;
		boolean logInSuccessful = false;

		while (attempt < 3) {

			System.out.println("Enter a  4 digit pin ");
			int pin = sc.nextInt();

			if (pin == correctPin) {
				System.out.println("Login Succesful");
				logInSuccessful = true;
				break;

			} else {
				attempt++;
				int leftAtmp = 3 - attempt;

				if (leftAtmp > 0) {

					System.out.println("WRONG PIN");
					System.out.println("Attempt left :" + leftAtmp);

				}

			}

		}
		if (!logInSuccessful) {
			System.out.println("Card Blocked....Try after 24 hours ..");
		}

		sc.close();
	}

}
