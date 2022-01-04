package com.te.constructorinjection;

public class Addition {

	private int a;
	private int b;

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor called : double , double");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor called : int , int");

	}

//	public Addition(String a, String b) {
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		System.out.println("Constructor called : String , String");
//
//	}

	@Override
	public String toString() {
		System.out.println("The value of a is :" + this.a);
		System.out.println("The value of b is :" + this.b);
		return "Addition [a=" + a + ", b=" + b + "]";
	}

}
