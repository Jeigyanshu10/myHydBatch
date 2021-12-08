package com.technoelevate.myjava8features;

public class Ravinder implements Savitri, Shiva {

	@Override
	public void add() {
		System.out.println("Nothing to add");
	}

	@Override
	public void sub() {
		System.out.println("Nothing to sub");
	}

	@Override
	public void job() {
		Shiva.super.job();
	}

}
