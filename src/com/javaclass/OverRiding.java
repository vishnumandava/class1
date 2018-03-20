package com.javaclass;

public class OverRiding extends OverLoading {
	public void add() {
		
		System.out.println("child");
	}
	

	public static void main(String args[]) {
		
		
		OverLoading a = new OverLoading();
		
		OverLoading.add(10,10);
		
		OverLoading b = new OverRiding();
		OverLoading.add(20,80);
		
		
		
		
	}

}
