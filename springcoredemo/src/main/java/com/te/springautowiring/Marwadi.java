package com.te.springautowiring;

public class Marwadi {

	private Customer cust;

	public Marwadi(Customer cust) {
		super();
		this.cust = cust;
	}

	public Marwadi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "Marwadi [cust=" + cust + "]";
	}

}
