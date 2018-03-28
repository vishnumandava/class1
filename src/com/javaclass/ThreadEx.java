package com.javaclass;

public class ThreadEx extends Thread{
	@Override
	public void run() {
		int i;
		for (i = 0; i <= 50; i++) {
			System.out.println("Number is " + i);
		}

	}



}
