package com.kodewala.constructors4.practice.Super;

public class LiveSports extends Content {

	String sportName;
	String matchStatus;
	int liveViwers;

	public LiveSports() {
		this("c101", "Live Match", "English", "Cricket", "Live", 0);

		System.out.println("LiveSports default constructor ");
	}

	public LiveSports(String _contentId, String _titel, String _language, String _sportName, String _matchStatus,
			int _liveViwers) {

		super(_contentId, _titel, _language);

		this.sportName = _sportName;
		this.matchStatus = _matchStatus;
		this.liveViwers = _liveViwers;

		System.out.println("LiveSPorts patameterised constructor ");

	}

}
