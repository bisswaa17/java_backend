package com.kodewala.Strings2;
   
   class User{
	   String name ;

	   public User(String name) {
		super();
		this.name = name;
	   }
	   
   }

public class Driver3 {

	public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = new String ("Kodewala");
		System.out.println(s1 == s2); // compare the address of String object 
		System.out.println(s1.equals(s2)); // compare the content of String object  
		
		User u1 = new User("Kodewala");
		User u2 = new User ("Kodewala");
		System.out.println(u1 == u2); // it will compare the address of the Object class 
		
		System.out.println(u1.equals(u2)); //User class -->  Object class
		                                   // Object class equal method returns reference of the object
		
		

	}

}
