package com.te.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KhanBhai {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/te/beanlifecycle/lifeCycleConfig.xml");
		Samosa sm1 = context.getBean("s1", Samosa.class);
		System.out.println(sm1);
		context.registerShutdownHook();

		Pepsi ps1 = context.getBean("pepsi", Pepsi.class);
		System.out.println(ps1);

		Perls pl = context.getBean("pearl", Perls.class);
		System.out.println(pl);

	}

}
