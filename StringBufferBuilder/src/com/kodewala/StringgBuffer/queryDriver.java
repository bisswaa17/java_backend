package com.kodewala.StringgBuffer;

public class queryDriver {

	public static void main(String[] args) {
		QueryGenerator qg = new QueryGenerator();
		StringBuilder s = qg.generateQuery(25000, null);
		System.out.println(s);

	}

}
