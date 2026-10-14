package com.kodewala.constructors3;

class SuperUser extends Object {
	// creating a constructor for superUser
	SuperUser(int age, String department) {
		System.out.println("SuperUser is called " + age + " " + department);

	}
	
	
	
}

public class User2 extends SuperUser {

	String name;
	String userId;
	String mobile;

	public User2(String _name, String _userId, String _mobile)

	{

		super(22, "cse"); // first line constructor either super() or this()...if we don't write
		// anything then compiler will add a super () with no args ...
		this.name = _name;
		this.userId = _userId;
		this.mobile = _mobile;

	}

	public void display() {
		System.out.println("User name :" + name);
		System.out.println("UserId :" + userId);
		System.out.println("Mobile no:" + mobile);
		
	}

}
