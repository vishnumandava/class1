package com.javaclass;

import com.javaclass.CheckPrime;
public class PrintPrime {
	public void printPrimeNumbers() {
	
		CheckPrime ch = new CheckPrime();
		for(int i=3; i<=200; i++) {
			boolean status = ch.isPrime(i);
			System.out.println(i+"is "+ status);
	
		}

	}
	public static void main(String args[]) {
		PrintPrime p = new PrintPrime();
		p.printPrimeNumbers();
	}
		
}

