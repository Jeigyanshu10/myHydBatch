package com.te.flyingwithbpp;

public class Teacher {

	private Student student;
	private Subject subject;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
		System.out.println("Setting the student inside the setStudent() of Teacher");
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
		System.out.println("Setting the subject inside the setSubject() of Teacher");
	}

	public Teacher(Student student, Subject subject) {
		super();
		this.student = student;
		this.subject = subject;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [student=" + student + ", subject=" + subject + "]";
	}

	public void teacherInit() {
		System.out.println("Inside init() of Teacher");
	}

}
