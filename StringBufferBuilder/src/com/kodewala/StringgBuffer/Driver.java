package com.kodewala.StringgBuffer;

public class Driver {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala"); // String Builder Object -----> mutable..

		for (int i = 0; i < 10; i++) {
			sb.append(" Academy" + i); // same object is modified , No NEW object is created..
		}

		System.out.println(sb);

	}

}
