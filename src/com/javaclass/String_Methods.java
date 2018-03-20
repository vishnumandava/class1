package com.javaclass;
import java.util.*;
import java.io.*;

public class String_Methods {
	public static void main(String[] args) {
	String s = "NAGA@vishnu@Mandava";
	String [] arrOfStr = s.split("@",5);  
	System.out.println("String length = " + s.length());
	System.out.println("Changing to Lower case = " + s.toLowerCase());
	System.out.println("Changing to upper case = " + s.toUpperCase());
	System.out.println("Trim the Word = " + s.trim());
	System.out.println("Replaced N with M = " + s.replace('N' , 'M'));
	System.out.println("Index of i = " + s.indexOf('i'));
	System.out.println("Character at = " + s.charAt(3));
	System.out.println("Sub String  = " + s.substring(3));
	for(String a : arrOfStr)
		System.out.println(a);
	System.out.println("Is this string empty ? = " + s.isEmpty());
	System.out.println("Starts with = " + s.startsWith("vishnu"));
	System.out.println("Is this startswith = " + s.startsWith("@",4));
	System.out.println("Subsequence = " + s.subSequence(0,10));
		
	}
}
