package com.technoelevate.myjava8features;

public interface Savitri {
	public void add();

	public void sub();

	default void job() {
		System.out.println("Quality Analyst");
	}
}
