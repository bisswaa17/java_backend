package com.kodewala.Strings1;
 
 class User{
	 String user;

	 public User(String user) {
		super();
		this.user = user;
	 }
	 
 }
public class Driver1 {
	public static void main(String[] args) {
		
		String city1 ="Banglore";
		String city2 ="Banglore";
		String city3 ="Banglore";
		String city4 ="Banglore";
		String city5 ="Banglore";
		
		System.out.println(city1.equals(city2)); // in String equals() compare the content...
		                                         // it will override the Object class 
		User u1 = new User ("Kodewala");
		User u2 = new User ("Kodewala");
		System.out.println(u1.equals(u2)); // equals() belongs to Object class and 
		
		                                    // it will compare the reference of the content..
	}

}
