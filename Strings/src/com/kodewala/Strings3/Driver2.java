package com.kodewala.Strings3;

public class Driver2 {
			public static void main(String[] args) {
				String s2 = "Kodewala"; // ---> SCP
				
				String s3 = "Academy"; // ----> SCP
				
				String s4 = s2 + s3; // heap --> newStringBuilder();
				System.out.println(s4);
				
				String s5 = "KodewalaAcademy";
				
				System.out.println(s5 == s4);
				System.out.println(s5 == s4.intern());
				
				String s6 =new String( "Kodewala");
				System.out.println(s2==s6.intern());
			}
}
