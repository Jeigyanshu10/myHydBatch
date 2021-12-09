package com.technoelevate.myjava8features;

public class Main {

	public static void main(String[] args) {

		MyInterface mi = (String name) -> {
			return "Hello " + name;
		};
		System.out.println(mi.greet("Bindu"));

	}
}
