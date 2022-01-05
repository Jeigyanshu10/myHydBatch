package com.te.flyingwithbpp;

public class Subject {

	private String name;
	private String duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting the name inside the setName() of Subject");
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		System.out.println("Setting the duration inside the setDuration() of Subject");
	}

	public Subject(String name, String duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", duration=" + duration + "]";
	}

	public void subjectInit() {
		System.out.println("Inside init() of Subject");
	}

}
