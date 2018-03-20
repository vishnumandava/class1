package com.javaclass;

public class OverLoading {


	
	
	
	public static int add(int i , int j)
	{
		return(i+j);
	}
	
	public static double add(double i, double j)
	{
		return(i-j);
	}

	public static void main(String args[])
	{
		System.out.println(add(2,5));
		System.out.println(add(8.5,5.5));
		
	}

}
