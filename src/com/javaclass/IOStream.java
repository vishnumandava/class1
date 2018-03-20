package com.javaclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOStream {
	public void writeFile() throws IOException	{
		File f = new File("C:\\Users\\nagav\\Videos\\mmmmm\\test.txt");
		
		OutputStream os = new FileOutputStream(f);
		
		String s = "Hello how are you";
		
		os.write(s.getBytes());
		
		os.close();
	}

	public static void main(String[] args) throws IOException {
		
		IOStream ios = new IOStream();
		
		ios.writeFile();
		
	}


}
