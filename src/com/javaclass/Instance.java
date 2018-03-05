package com.javaclass;
import  com.javaclass.CheckPrime;
public class Instance {
	public String message = "we are learning static keyword";
	public int number = 520;
	public void printPrimeNumbers() {
		for(int i = 3; i<=180; i++) {
			boolean status = CheckPrime.isPrime(i);
			System.out.println(i+" is "+ status);
			
			
		}
		
	}
	public static void main(String args[]) {
		
		Instance p1 = new Instance();
		Instance p2 = new Instance();
		Instance p3 = new Instance();
		
		p1.number = 800;
		p1.message = "I am trying to learn static variable";
		p1.printPrimeNumbers();
		
		System.out.println("The value of number : "+ p2.number);
		System.out.println("The value of message : "+ p2.message);
		
	}
}


