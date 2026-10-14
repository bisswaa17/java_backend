package com.kodewala.scanner.practice;


import java.util.Scanner;

public class InputArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
//		int target = 12;
		
		System.out.println("Enter "+ n + " elements");
		
		for(int i = 0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
			
		}
//		System.out.println("Array elents are :");
//		for(int i = 0 ; i< n-1 ;i++) {
//			if(target == arr[i]) {
//			System.out.print(arr[i]);
//			}
//			
//			
//		}
		
		//for each loop ---> used to traverse the array 
		// 
		for(int val:arr  ) {
			System.out.println(val);
		}
		
		sc.close();
		
		
	}

}
