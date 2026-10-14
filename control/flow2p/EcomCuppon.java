package com.kodewala.control.flow2p;

public class EcomCuppon {

	public void cupponApply(double orderAmount ) {
		 int discount ;
		 double price ;
		 
		 
		
		if (orderAmount < 500) {
			System.out.println("Oops!! no cuppon apllied on your order ");
			
		}
		else if (orderAmount >= 500  && orderAmount < 1000 ) {
			System.out.println("only 5 % discount applied.. ");
			
			discount = (int)(orderAmount * 5 / 100);
			price = orderAmount - discount;
			System.out.println(" Paid only :"+price);
			
			
		}
		else if (orderAmount >=  1000 && orderAmount <=10000) {
			System.out.println("Discount 15% ");
			discount = (int)(orderAmount * 15 /100);
			price = orderAmount - discount;
			System.out.println(" Paid only :"+price +" you got extra 5% cashback in Axix bank credit card");
			System.out.println("You are on Maximum discount..");
		}
		else {
			System.out.println("cuppon expired");
		}
	}

}
