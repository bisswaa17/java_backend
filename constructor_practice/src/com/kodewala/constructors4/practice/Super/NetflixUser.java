package com.kodewala.constructors4.practice.Super;

public class NetflixUser {

	String userId;
	String name;
	String email;

	public NetflixUser(String _userId, String _name, String _email) {
		super();// super() with no args...
		this.userId = _userId;
		this.name = _name;
		this.email = _email;
	}

}
