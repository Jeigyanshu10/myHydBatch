package com.te.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Perls {

	private double price;

	public Perls(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Perls [price=" + price + "]";
	}

	@PostConstruct
	public void getPearl() {
		System.out.println("Tear the sachet");
	}

	@PreDestroy
	public void finishedPearl() {
		System.out.println("Throw the sachet");
	}

}
