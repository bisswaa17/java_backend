package com.kodewala.Strings2;

public class Driver {
	public static void main(String[] args) {
		
		String s1 = "Kodewala"; // SCP ---address --123xyz
		
		String s2 = new String ("Academy"); //one object in scp + one in heap  ----address--> 431sbd
		                                    //
		
//		System.out.println(s1 == s2); // 123xyz == 431sbd ---(no) ---> false
		
		String s3 = new String("Kodewala");
		String s4 = new String ("Kodewala"); // in heap when object is created by using new keyword address will be always different
		                                     // when if the content is same ..
		
		System.out.println(s4 == s3);
		System.out.println(s4.equals(s3));
		
		String s5 = "Biswa"; // in SCP --> referance is s5
		String s6 = new String("Biswa"); // scp referance is   + heap referance is s6
		
		String s7 = new String ("kodewala");
		
		
		
	}

}
