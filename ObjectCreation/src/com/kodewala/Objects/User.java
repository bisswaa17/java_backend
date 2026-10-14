package com.kodewala.Objects;

public class User {

	String userName;
	String userId;
	String mobileNumber;
	// static block will get executed only ONCE per class just after the class loading 
    static
	{
		System.out.println("i am in static block");
	}

	public User(String userName, String userId, String mobileNumber) {
		super();
		System.out.println("User.User(String userName, String userId, String mobileNumber)");
		this.userName = userName;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
	}

}
