package com.te.singletondp;

public class Main {

	public static void main(String[] args) {
		SingletonDemo sd1 = SingletonDemo.getInstance();
		SingletonDemo sd2 = SingletonDemo.getInstance();
		SingletonDemo sd3 = SingletonDemo.getInstance();
		SingletonDemo sd4 = SingletonDemo.getInstance();
		SingletonDemo sd5 = SingletonDemo.getInstance();
//		if (sd1 == sd2) {
//			System.out.println("Singletondemo is a singleton class avunu");
//		} else {
//			System.out.println("Singletondemo is a singleton class kadu");
//		}

		System.out.println(sd1.hashCode());
		System.out.println(sd2.hashCode());
		System.out.println(sd3.hashCode());
		System.out.println(sd4.hashCode());
		System.out.println(sd5.hashCode());

	}

}
