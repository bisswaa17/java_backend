package com.kodewala.Strings1;

public class Test {

	public static void main(String[] args) {
		
		String a = "Java";
		String b = "Java";
		String c = "Ja"+"va";
//		System.out.println(a == b); true because same address in SCP 
		
		
		String s1 = new String("Biswa");
		String s2 = new String ("BIswa");
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
		
		
		String a1 = "Hello";
		String a2 = new String ("Hello");
		String d1 = new String ("Java");
		
//		System.out.println(a1 == a2);// address are different and memory allocation in different place 
//		System.out.println(c==d1);  false
		
	}

}
