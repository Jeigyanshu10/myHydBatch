package com.te.constructorinjection;

public class Person {
	private int id;
	private String name;
	private Cirtificate certi;

	public Person(int id, String name, Cirtificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}

}
