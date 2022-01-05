package com.te.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/beanscope/scopeConfig.xml");
		Laptop lap = context.getBean("lappy", Laptop.class);
		System.out.println(lap.hashCode());
		Laptop lap1 = context.getBean("lappy", Laptop.class);
		System.out.println(lap1.hashCode());

	}

}
