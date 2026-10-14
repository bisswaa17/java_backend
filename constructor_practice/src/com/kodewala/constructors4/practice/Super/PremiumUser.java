package com.kodewala.constructors4.practice.Super;

public class PremiumUser extends NetflixUser {

	String subPlan;
	String subExpDate;

	public PremiumUser(String _userId, String _name, String _email, String _subPlan, String _expDate) {
		super(_userId, _name, _email);
		this.subPlan = _subPlan;
		this.subExpDate = _expDate;
	}
	
	void show() {
		System.out.println("User Id :"+userId);
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Plan:"+subPlan);
		System.out.println("Validity Till:"+subExpDate);
	}

}
