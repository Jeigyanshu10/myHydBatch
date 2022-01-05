package com.te.springautowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("Deepthi Mam")
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

	public void idiot() {
		System.out.println("Donu am an idiot");
	}

}
