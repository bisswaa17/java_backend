package com.kodewala.Strings2;

public class Driver2 {
	public static void main(String[] args) {
		
		String s = "Kodewala"; // scp
		
		s.concat("Academy");
		
		System.out.println(s);
		
		String s2 = s.concat("Academy"); // trying to change the object 
		                                 // object is created in heap with content Kodewala Academy
		System.out.println(s2);
		
	}

}
