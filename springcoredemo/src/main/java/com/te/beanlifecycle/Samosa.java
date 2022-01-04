package com.te.beanlifecycle;

public class Samosa {

	private double price;
	private String type;

	public Samosa(double price, String type) {
		super();
		this.price = price;
		this.type = type;
		System.out.println("Initializing using constructor");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + ", type=" + type + "]";
	}

	public void samosaInit() {
		System.out.println("Khan bhai samosa really tasty");
		// getting the connection logic
		// connecting to a webservice logic
	}

	public void samosaDestroyed() {
		System.out.println("Samosa burped");
	}

}
