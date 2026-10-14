package com.kodewala.arrays1;

public class Driver1 {
	public static void main(String[] args) {
		
		Delivery d1 = new Delivery("id01250", "Rohit", 499.00);
		Delivery d2 = new Delivery("id01750", "Rishi", 49);
		Delivery d3 = new Delivery("c01250", "Asish", 1499);
		Delivery d4 = new Delivery("E_01250", "ALex", 5000);
		Delivery d5 = new Delivery("id01250", "Biswa",50);
		
		Delivery[] delivery = new Delivery[5];
		
		delivery[0]= d1;
	    delivery[1]= d2;
	    delivery[2]= d3;
	    delivery[3]= d4;
	    delivery[4]= d5;
	    
		
		System.out.println(delivery);
		
		
	}

}
