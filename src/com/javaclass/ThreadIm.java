package com.javaclass;

public class ThreadIm  {

public static void main(String[] args) {
	

	ThreadEx t1 = new ThreadEx();
	t1.start();
	
	ThreadEx t2 = new ThreadEx();
	t2.start();

	Thread t3 = new Thread(new ThreadRun());
	t3.start();
	

	Thread t4 = new Thread(new ThreadRun());
	t4.start();

}

}
