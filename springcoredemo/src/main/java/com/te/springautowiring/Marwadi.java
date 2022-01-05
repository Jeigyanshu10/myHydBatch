package com.te.springautowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("marwadi123")
public class Marwadi {

	@Autowired
	private Customer cust;

	@Value("#{sweets}")
	private List<String> sweets;

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public List<String> getSweets() {
		return sweets;
	}

	public void setSweets(List<String> sweets) {
		this.sweets = sweets;
	}

	public Marwadi(Customer cust, List<String> sweets) {
		super();
		this.cust = cust;
		this.sweets = sweets;
	}

	public Marwadi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marwadi [cust=" + cust + ", sweets=" + sweets + "]";
	}

}
