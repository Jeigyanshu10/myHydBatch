package com.te.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/springautowiring/autowireConfig.xml");
		Marwadi mar = context.getBean("marwadi123", Marwadi.class);
		System.out.println("Hello " + mar.getCust().getName() + " Please choose from the below sweet for Jeigyanshu:");
		System.out.println(mar.getSweets());
	}

}
