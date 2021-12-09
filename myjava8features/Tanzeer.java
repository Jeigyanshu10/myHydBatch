package com.technoelevate.myjava8features;

public class Tanzeer {

	public void myPunishment() {
		System.out.println("I am ready for the punishment");
	}

	public static void main(String[] args) {

		Punishment punish = CleanBoard::new;
		punish.cleanBoard("Tanzeer", "Duster").punishMe();

	}

}
