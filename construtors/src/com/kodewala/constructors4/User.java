package com.kodewala.constructors4;

/**
 * This is Netflix class construcctor.
 */

public class User {
	String name;
	String mobileNum;
	String type;
	
	public User(String _name,String _mobileNum,String _type) {
		
		this.name = _name;
		this.mobileNum =_mobileNum;
		this.type =_type;
	}
	
	public User () {
		this("Biswajit","7452692302", "Premium");
		
	}

}
