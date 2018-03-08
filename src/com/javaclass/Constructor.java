package com.javaclass;

public class Constructor {

	public Constructor() {
		System.out.println("This is default constructor");
	}

	public Constructor(int i) {
		System.out.println("This is single parameter constructor with int value " + i);
	}

	public Constructor(String s) {
		System.out.println("This is constructor with string object " + s);
	}

	public Constructor(int j, String str) {
		System.out.println("This is constructor with one int value " + j + " and string object is " + str);

	}

	public static void main(String args[]) {
		Constructor a = new Constructor();
		Constructor b = new Constructor(100);
		Constructor c = new Constructor("vishnu");
		Constructor d = new Constructor(500, "Naga");

	}

}
