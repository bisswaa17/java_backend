package com.kodewala.constructors4.practice.Super;

public class PremiumLiveSports extends LiveSports {

	boolean premiumRequired;
	double premiumPrice;

	public PremiumLiveSports() {
		this("c505", "Ind vs Aus", "Eng", "Cricket", "Live", 10000000, true, 299);

		System.out.println("PremiumLiveSports default constructor ");
	}

	public PremiumLiveSports(String _contentId, String _titel, String _language, String _sportName, String _matchStatus,
			int _liveViwers, boolean _premiumRequired, double _premiumPrice) {

		super(_contentId, _titel, _language, _sportName, _matchStatus, _liveViwers);

		this.premiumRequired = _premiumRequired;
		this.premiumPrice = _premiumPrice;

		System.out.println("Premium live sports parameterized constructor");

	}

	void display() {
		System.out.println(contentId);
		System.out.println(titel);
		System.out.println(language);
		System.out.println(sportName);
		System.out.println(matchStatus);
		System.out.println(liveViwers);
		System.out.println(premiumRequired);
		System.out.println(premiumPrice);
	}

}
