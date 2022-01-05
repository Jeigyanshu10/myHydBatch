package com.te.flyingwithbpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/te/flyingwithbpp/beanProcessConfig.xml");
		Teacher cheater = context.getBean("teacher", Teacher.class);
		System.out.println(cheater);
	}

}
