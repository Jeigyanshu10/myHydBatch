package com.te.purepureannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Players player = context.getBean("athlete", Players.class);
		Football soccer = context.getBean("soccer", Football.class);
		soccer.getDetails(player);

	}

}
