package com.technoelevate.myjava8features;

@FunctionalInterface
public interface Punishment {
	public CleanBoard cleanBoard(String criminal, String equipment);

	static void myStaticMethod() {
		System.out.println("Hi from static method inside the Punishment interface");
	}

}
