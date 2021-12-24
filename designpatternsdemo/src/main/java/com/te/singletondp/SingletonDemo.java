package com.te.singletondp;

public class SingletonDemo {

	private static SingletonDemo sd;

	private SingletonDemo() {
	}

	public static SingletonDemo getInstance() {
		synchronized (SingletonDemo.class) {
			if (sd == null) {
				sd = new SingletonDemo();
			}
		}
		return sd;
	}

}
