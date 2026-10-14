package com.kodewala.Encapsulation;

public class TransferDriver {

	public static void main(String[] args) {
		FundTransfer transfer = new FundTransfer("Biswajit", "17923535233", 5000);
		transfer.doTransfer(1000);
		System.out.println("Balance is :" + transfer.getBalance());

	}

}
