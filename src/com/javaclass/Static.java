package com.javaclass;
import com.javaclass.CheckPrime;
public class Static {
	public String message = "we are learning static keyword";
	public  static int number = 520;
	public void printPrimeNumbers() {
		for(int i = 3; i<=180; i++) {
			boolean status = CheckPrime.isPrime(i);
			System.out.println(i+" is "+ status);
			
			
		}
		
	}
	public static void main(String args[]) {
		
		Static p1 = new Static();
		Static p2 = new Static();
		Static p3 = new Static();
		
		p1.number = 800;
		p1.message = "I am trying to learn static variable";
		p1.printPrimeNumbers();
		
		System.out.println("The value of number : "+ p2.number);
		System.out.println("The value of message : "+ p2.message);
		
	}
}
