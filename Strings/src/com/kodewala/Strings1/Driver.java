package com.kodewala.Strings1;

public class Driver {
	public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = "Kodewala";
		// object created in SCP ---> s1 address ---> xyz321
		// object with content "Kodewala" already created in SCP.. and when we created
		// another object with
		// same content s2 = "Kodewala" will refer to existing object .
		// s2 is also pointing to address -----> xyz321

		System.out.println(s1 == s2);//compare the address of an object
	}

}

// SCP is part of heap memory where the String object is created and previously it was named as 
//perm gen or MetaSpace ...

//we can create String obj by two way 
//1. by String literals 
//2. by new keyword..
//garbage collector is not part of scp..



//Sir if the string pool is out of scope of garbage collector then what will will happen those object which is having no reference ?