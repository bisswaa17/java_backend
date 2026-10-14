package com.kodewala.Strings3;

public class Driver {

	public static void main(String[] args) {
		// compile time optimization using + operator
		
		String s1 = "This " + " is" + " from kodewala academy"; // it will optimized at compile time..
		// these literals are acts as constant
		System.out.println(s1);
		
		String s2 = "Kodewala"; // scp
		String s3 = "Academy"; // scp
		
		String s4 = s2 + s3 ; // heap --> new StringBuilder();
//		System.out.println(s4);
		
		
	}

}
