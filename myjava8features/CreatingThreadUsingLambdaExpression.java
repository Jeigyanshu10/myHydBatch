package com.technoelevate.myjava8features;

public class CreatingThreadUsingLambdaExpression {

	public static void main(String[] args) {

//		Runnable myRunnableThread = () -> {
//			Thread.currentThread().setName("Lambda Thread");
//			for (int i = 10; i > 0; i--) {
//				System.out.println("Hello from " + Thread.currentThread().getName());
//			}
//		};
//
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello from mr.Swamy");
			}
		}).start();

	}

}
