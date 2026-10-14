package com.kodewala.forLoops;

public class DriverSbi {
	public static void main(String[] args) {

		SbiAccounts acc1 = new SbiAccounts("Biswa", 7500, "74824921332");
		SbiAccounts acc2 = new SbiAccounts("Rudra", 3500, "984512630");
		SbiAccounts acc3 = new SbiAccounts("Rohit", 1500, "7646523132");
		SbiAccounts acc4 = new SbiAccounts("jay", 700, "8452203132");
		SbiAccounts acc5 = new SbiAccounts("Ram", 10000, "998249232");

		
		SbiAccounts[] customer = new SbiAccounts[5];

		customer[0] = acc1;
		customer[1] = acc2;
		customer[2] = acc3;
		customer[3] = acc4;
		customer[4] = acc5;

		for (int i = 0; i < customer.length; i++) {
			if (customer[i].accBalance < 2000) {
				System.out.println("Customer with less than 2000 :"+customer[i].name );

			}
		}

	}

}
