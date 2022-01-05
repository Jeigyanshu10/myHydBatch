package com.te.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lappy")
@Scope("prototype")
public class Laptop {

	private String name;
	private int processor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProcessor() {
		return processor;
	}

	public void setProcessor(int processor) {
		this.processor = processor;
	}

	public Laptop(String name, int processor) {
		super();
		this.name = name;
		this.processor = processor;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", processor=" + processor + "]";
	}

}
