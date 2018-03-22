package com.javaclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SDpractice {
	public static void main(String arr[]) throws IOException, ClassNotFoundException {
		SEvent e = new SEvent();
		
		e.setName("Mandava");
		e.setAddress("Frisco");
		OutputStream os = new FileOutputStream("C:\\Users\\nagav\\Desktop\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(e);
		
		InputStream is = new FileInputStream("C:\\Users\\nagav\\Desktop\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(is);
		
		SEvent e1 = (SEvent)ois.readObject();
		System.out.println("Name is " + e1.getName());
		System.out.println("Address is " + e1.getAddress());
		
		
		
		
	}

}
