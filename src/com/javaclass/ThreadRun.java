package com.javaclass;

public class ThreadRun implements Runnable {
	@Override
	
	public void run() {
		int i;
		for (i = 10; i <= 100; i++) {
			System.out.println("Two D Number  " + i);
		}

	}

}
