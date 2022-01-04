package com.te.refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/refinjection/refConfig.xml");
		Student stud1 = context.getBean("student1", Student.class);
		System.out.println(stud1.getAddress());
	}

}
