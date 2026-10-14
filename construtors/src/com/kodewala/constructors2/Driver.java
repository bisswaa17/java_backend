package com.kodewala.constructors2;

class Invoice extends Object {

	static int gst = 18;
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

	public Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;

	}
}

public class Driver {

	public static void main(String[] args) {
		
		//Invoice.gst=20;

		Invoice inv = new Invoice(180000, "iphone 18", "btm 2nd stage", "c0987", "biswa");
		Invoice inv2 = new Invoice(5000, "oppo", "btm 2nd stage ", "c4510", "Rishi");

		System.out.println("First Invoice :" + inv.amount + "," + inv.itemName + "," + inv.billingAddress + ","
				+ inv.customerName + "," + Invoice.gst);
		System.out.println("Second Invoice :" + inv2.amount + "," + inv2.customerId + ","+inv2.gst);

	}

}
