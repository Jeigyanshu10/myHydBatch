package com.te.springautowiring;

public class Customer {

	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

}
