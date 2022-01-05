package com.te.pureannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Players.class);
		Football soccer = context.getBean("football", Football.class);
		System.out.println(soccer);

	}

}
