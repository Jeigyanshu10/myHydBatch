package com.technoelevate.multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from MyRunnable implementation of run()" + Thread.currentThread().getName());

	}

}
