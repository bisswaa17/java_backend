package com.kodewala.constructors3;



public class User  {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		// this(); // calling same class (User ) constructor..
		this(200);
		// we can't call two constructor ...

		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;

	}

	User() {

		System.out.println("calling same class constructor with no args"); // for log and monitoring.....

	}

	User(int age) {

		System.out.println("calling same class constructor with one args");

	}

	public void display() {
		System.out.println("User name :" + userName);
		System.out.println("UserId :" + userId);
		System.out.println("Mobile no:" + mobile);
	}

}
