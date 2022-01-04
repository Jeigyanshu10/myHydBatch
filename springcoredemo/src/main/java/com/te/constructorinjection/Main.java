package com.te.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/te/constructorinjection/constInjectConfig.xml");
//		Person p1 = context.getBean("person1", Person.class);
//		System.out.println(p1);

		Addition add = context.getBean("addition", Addition.class);
		System.out.println(add);

	}

}
