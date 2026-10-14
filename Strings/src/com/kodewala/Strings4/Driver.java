package com.kodewala.Strings4;

class  AccountMgmt  { // final -> this class can not be parents if it final 
	
	final int UPI_LIMIT = 100000; // constant in java , constant are always UPPER_CASE
	public final void doSomething1() {
		

	}

	public void doSomething2() {
		UPI_LIMIT = 200000; // is not able to change 
		//some func ..

	}
}

class Account extends AccountMgmt {
	
     @Override
	public void doSomething1() {  // final method can't be Override..
		// 

	}

	public void doSomething2() {
		// some function....

	}
}

public class Driver {

	public static void main(String[] args) {
		

	}

}
