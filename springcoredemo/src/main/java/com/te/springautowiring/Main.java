package com.te.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/springautowiring/autowireConfig.xml");
		Marwadi mar = context.getBean("marwadi", Marwadi.class);
		System.out.println(mar);
	}

}
