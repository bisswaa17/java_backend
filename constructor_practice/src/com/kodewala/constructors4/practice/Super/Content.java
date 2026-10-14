package com.kodewala.constructors4.practice.Super;

public class Content {

	String contentId;
	String titel;
	String language;

	public Content() {
		// intialised the to Content constructor..
		this("C469", "ChotaBheem", "Hindi");

		System.out.println("Content Default constructor ..");

	}

	public Content(String _contentId, String _titel, String _language) {

		this.contentId = _contentId;
		this.titel = _titel;
		this.language = _language;
		System.out.println("content parameeterized constructor");

	}

}
