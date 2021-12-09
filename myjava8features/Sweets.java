package com.technoelevate.myjava8features;

public class Sweets {

	private String name;
	private double price;
	private int quantity;

	public Sweets(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void payment() {
		double totalPrice = this.price * this.quantity;
		System.out.println("Please pay " + totalPrice + " at the counter");
	}

}
