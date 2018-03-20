package com.javaclass;

public class ExceptionHandling {
	public static void main(String args[]) throws ArithmeticException {
		int i,j,k=0;
		i=2;
		j=0;
		try {
			k=i/j;
		}
		catch(Exception e) {
		
			
		
			System.out.println("Cannot divide by zero");
			System.out.println(k);
		}
		
		
	}

}
