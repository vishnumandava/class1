package com.javaclass;

public abstract class Abstract_Class {
	public void split(String paragraph) {
		paragraph = "Hi, how are you?";
		String[] arr = paragraph.split("\\s");
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Individual .string" + arr[0]);
			
			
		}
		
	}
	public abstract void split(String paragraph, int i);

}
