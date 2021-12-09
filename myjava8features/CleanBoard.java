package com.technoelevate.myjava8features;

public class CleanBoard {

	private String criminal;
	private String equipment;

	public CleanBoard(String criminal, String equipment) {
		this.criminal = criminal;
		this.equipment = equipment;
	}

	public void punishMe() {
		System.out.println(this.criminal + " start the punishment using " + this.equipment);
	}

}
